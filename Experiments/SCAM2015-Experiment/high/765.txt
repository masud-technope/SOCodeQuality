// First cast ServletRequest to HttpServletRequest.
HttpServletRequest hsr = (HttpServletRequest) request;

// Check if requested resource is not in /test folder.
if (!hsr.getServletPath().startsWith("/test/")) {
    // Not in /test folder. Do your thing here.
}