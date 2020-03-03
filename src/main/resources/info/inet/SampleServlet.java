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
         resp.getWriter().write("Hello World! Maven Web Project Example. ");
         resp.getWriter().write("Hello World! Maven Web Project Example ");
         
         static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://mysql1:3306/MyDB";

   static final String USER = "root";
   static final String PASS = "mysql";
   
  
   Connection conn = null;
   Statement stmt = null;
   
      
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      
         
         
         
         resp.getWriter().write("Establishing Connection : "+conn);
         stmt=con.createStatement();  
         resp.getWriter().write("Statement : "+stmt);
         int updates = stmt.executeUpdate("insert into EMP values(2,'Krishna')");
         resp.getWriter().write("Records updated : "+updates);
      } catch(Exception e){ 
         System.out.println(e);
      }  
   }
}
