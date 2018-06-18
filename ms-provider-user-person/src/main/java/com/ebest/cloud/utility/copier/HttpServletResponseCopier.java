package com.ebest.cloud.utility.copier;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * HttpServletResponseCopier class
 * @author ebest
 *
 */
public class HttpServletResponseCopier extends HttpServletResponseWrapper {	
	
	private ServletOutputStream outputStream;
	private PrintWriter writer;
	private ServletOutputStreamCopier copier;

	/**
	 * HttpServletResponseCopier constructor
	 * @param response
	 * @throws IOException
	 */
	public HttpServletResponseCopier(HttpServletResponse response) throws IOException {
		super(response);
	}

	/**
	 * override getOutputStream
	 */
	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		if (writer != null) {
			throw new IllegalStateException("getWriter() has already been called on this response.");
		}
		if (outputStream == null) {
			outputStream = getResponse().getOutputStream();
			copier = new ServletOutputStreamCopier(outputStream);
		}
		return copier;
	}

	/**
	 * override getWriter
	 */
	@Override
	public PrintWriter getWriter() throws IOException {
		if (outputStream != null) {
			throw new IllegalStateException("getOutputStream() has already been called on this response.");
		}
		if (writer == null) {
			copier = new ServletOutputStreamCopier(getResponse().getOutputStream());
			writer = new PrintWriter(new OutputStreamWriter(copier, getResponse().getCharacterEncoding()), true);
		}
		return writer;
	}

	/**
	 * override flushBuffer
	 */
	@Override
	public void flushBuffer() throws IOException {
		if (writer != null) {
			writer.flush();
		} else if (outputStream != null) {
			copier.flush();
		}
	}

	/**
	 * HttpServletResponseCopier not equal to null,return byte[..]
	 * else return new byte[0]
	 * @return byte[]
	 */
	public byte[] getCopy() {
		if (copier != null) {
			return copier.getCopy();
		} else {
			return new byte[0];
		}
	}
}
