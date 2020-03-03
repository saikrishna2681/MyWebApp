package info.inet;

import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SampleServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException{
      
      //sendind response
      try {  
         resp.setContentType("text/plain");
         resp.getWriter().write("Hello World! Maven Web Project Example.");
         resp.getWriter().write("Hello World! Maven Web Project Example 1231324214234.");
         
         Class.forName("com.mysql.cj.jdbc.Driver");  
         Connection con=DriverManager.getConnection(  
         "jdbc:mysql://localhost:3306/MyDB","root","mysql"); 
         resp.getWriter().write("Establishing Connection : "+con);
         Statement stmt=con.createStatement();  
         resp.getWriter().write("Statement : "+stmt);
         int updates = stmt.executeUpdate("insert into EMP values(2,'Krishna')");
         resp.getWriter().write("Records updated : "+updates);
      } catch(Exception e){ 
         System.out.println(e);
      }  
   }
}
