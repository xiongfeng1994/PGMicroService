package com.ebest.msauthercenter;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * Config JWT.
 * Only one property 'shuaicj.security.jwt.secret' is mandatory.
 *
 * @author shuaicj 2017/10/18
 */
@Getter
@ToString
public class JwtAuthenticationConfig {

	   @Value("${shuaicj.security.jwt.url:/login}")
	    private String url;

	    @Value("${shuaicj.security.jwt.header:Authorization}")
	    private String header;

	    public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getHeader() {
			return header;
		}

		public void setHeader(String header) {
			this.header = header;
		}

		public String getPrefix() {
			return prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public int getExpiration() {
			return expiration;
		}

		public void setExpiration(int expiration) {
			this.expiration = expiration;
		}

		public String getSecret() {
			return secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		@Value("${shuaicj.security.jwt.prefix:Bearer}")
	    private String prefix;

	    @Value("${shuaicj.security.jwt.expiration:#{24*60*60}}")
	    private int expiration; // default 24 hours

	    @Value("${shuaicj.security.jwt.secret}")
	    private String secret;
}
