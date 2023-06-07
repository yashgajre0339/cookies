package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String name =req.getParameter("name");
        String tname=null;
//        Cookie cookie[]=req.getCookies();
//        
//      for(Cookie c: cookie) {
//    	  if(c.getName().equals("cname")) {
//    		  tname=c.getValue();
//    	  }
//      }
        
        HttpSession httpsession = req.getSession();
        tname= (String)httpsession.getAttribute("sname");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<html><body><h1>"+"welcome "+tname+" to my website"+"</h1></body></html>");
		pw.print("<a href ='servlet3'>Logout</a>");
	   

	}

}
