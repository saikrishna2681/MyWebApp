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
     
         resp.setContentType("text/plain");
         resp.getWriter().write("Hello World! Maven Web Project Example. ");
         resp.getWriter().write("Hello World! Maven Web Project Example ");
         
      
   
       try {  
     resp.setContentType("text/plain");
      resp.getWriter().write("Hello World! Maven Web Project Example.");
      
      Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection(  
      "jdbc:mysql://172.17.0.1:3306/MyDB","root","mysql"); 
      Statement stmt=con.createStatement();  
      int updates = stmt.executeUpdate("insert into MyDB.emp values(2,'Krishna')");
      
         
      } catch(Exception e){ 
         e.printStackTrace();
      }  
   }
}
