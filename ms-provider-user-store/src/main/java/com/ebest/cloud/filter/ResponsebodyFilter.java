package com.ebest.cloud.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

import com.ebest.cloud.utility.copier.HttpServletResponseCopier;
/**
 * response body filter
 * @author ebest
 *
 */
@Configuration
@WebFilter(urlPatterns = "/*")
public class ResponsebodyFilter implements Filter {
	
	/**
	 * override init
	 */
	@Override
	public void init(FilterConfig config) throws ServletException {
		// NOOP.
	}

	/**
	 * override doFilter
	 * if get character encoding equal null, set utf-8
	 * ServletResponse change to HttpServletResponseCopier
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		
		//set response characterEncoding
		if (response.getCharacterEncoding() == null) {
			response.setCharacterEncoding("UTF-8");
		}
		
		//get a responseCopier
		HttpServletResponseCopier responseCopier = new HttpServletResponseCopier((HttpServletResponse) response);
		chain.doFilter(request, responseCopier);
		responseCopier.flushBuffer();
	
	}

	@Override
	public void destroy() {
		// NOOP.
	}
}
