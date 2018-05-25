public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    if (servletRequest instanceof HttpServletRequest) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // Check wether the current request needs to be able to support the body to be read multiple times
        if (MULTI_READ_HTTP_METHODS.contains(request.getMethod())) {
            // Override current HttpServletRequest with custom implementation
            filterChain.doFilter(new HttpServletRequestWrapper(request), servletResponse);
            return;
        }
    }
    filterChain.doFilter(servletRequest, servletResponse);
}