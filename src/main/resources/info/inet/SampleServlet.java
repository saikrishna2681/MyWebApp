package info.inet;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
      
      //sendind response
      resp.setContentType("text/plain");
      resp.getWriter().write("Hello World! Maven Web Project Example.");
      resp.getWriter().write("Hello World! Maven Web Project Example.");
   }
}
