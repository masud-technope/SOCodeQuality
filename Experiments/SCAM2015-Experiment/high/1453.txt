public void doGet(HttpServletRequest request, HttpServletResponse response) {

    HttpSession session = request.getSession();
    String username = (String)request.getAttribute("un");
    session.setAttribute("UserName", username);
}