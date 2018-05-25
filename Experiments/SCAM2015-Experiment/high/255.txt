HttpSession session = request.getSession(false);// don't create if it doesn't exist
if(session != null && !session.isNew()) {
    chain.doFilter(request, response);
} else {
    response.sendRedirect("/login.jsp");
}