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

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =req.getParameter("name");
		
//		Cookie cookie= new Cookie("cname", name);
//		resp.addCookie(cookie);
		
		HttpSession httpsession= req.getSession();
        httpsession.setAttribute("sname", name);
		
		PrintWriter pw=resp.getWriter();
		pw.print("<html><body><h1>"+"welcome " +name+" to my website"+"</h1></body></html>");
	    pw.print("<a href='servlet2'> Go to servlet2</a>");
	}

}
