package org.opensrp.web;

import org.springframework.stereotype.Component;

@Component(value = "CORSFilter")
public class CorsFilter /*extends OncePerRequestFilter*/ {

	/*@Value("#{opensrp['opensrp.cors.allowed.source']}")
	private String opensrpAllowedSources;

	@Value("#{opensrp['opensrp.cors.max.age']}")
	private int corsMaxAge;

	public static final String ACCESS_CONTROL_ALLOW_ORIGIN_METHODS = "Access-Control-Allow-Methods";
	public static final String ACCESS_CONTROL_ALLOW_ORIGIN_HEADERS = "Access-Control-Allow-Headers";
	public static final String ACCESS_CONTROL_ALLOW_MAX_AGE = "Access-Control-Max-Age";

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// CORS "pre-flight" request
		response.addHeader(HTTP.ACCESS_CONTROL_ALLOW_ORIGIN_HEADER, opensrpAllowedSources);
		response.addHeader(ACCESS_CONTROL_ALLOW_ORIGIN_METHODS, "GET, PUT, POST, DELETE");
		response.addHeader(ACCESS_CONTROL_ALLOW_ORIGIN_HEADERS,
				"origin, content-type, accept, x-requested-with, Authorization");
		response.addHeader(ACCESS_CONTROL_ALLOW_MAX_AGE, String.valueOf(corsMaxAge));// 1 min
		filterChain.doFilter(request, response);
	} */
}
