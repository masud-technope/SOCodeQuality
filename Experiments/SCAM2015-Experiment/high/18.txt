public class MyServlet extends HttpServlet {

    public void init(final ServletConfig config) {
        final String context = config.getServletContext().getRealPath("/");
        ...
    }

    ...
}