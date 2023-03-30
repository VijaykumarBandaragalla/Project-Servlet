package com.girmiti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PracticeProject2 extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws IOException , ServletException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>this is a example for GenricServlets</h1>");
	}

	
}

//	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		res.setContentType("text/html");
//		PrintWriter output=res.getWriter();
//		output.println("<h1>this is an example for genric servlet</h1>");
//		
//	}