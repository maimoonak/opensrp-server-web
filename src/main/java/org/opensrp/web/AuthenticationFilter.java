package org.opensrp.web;

public class AuthenticationFilter /*extends OncePerRequestFilter*/ {
/*
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        filterChain.doFilter(request, new HttpServletResponseWrapper(response) {
            public void setContentType(String type) {
            }

            public void setHeader(String name, String value) {
                if (!name.equalsIgnoreCase(WWW_AUTHENTICATE_HEADER)) {
                    super.setHeader(name, value);
                }
            }

            public void addHeader(String name, String value) {
                if (!name.equalsIgnoreCase(WWW_AUTHENTICATE_HEADER)) {
                    super.addHeader(name, value);
                }
            }

            public void setIntHeader(String name, int value) {
                if (!name.equalsIgnoreCase("content-length")) {
                    super.setIntHeader(name, value);
                }
            }

            public void addIntHeader(String name, int value) {
                if (!name.equalsIgnoreCase(WWW_AUTHENTICATE_HEADER)) {
                    super.addIntHeader(name, value);
                }
            }
        });
    }

 */
}
