package com.girmiti;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//@WebServlet("/PracticeProject1")
public class PracticeProject1 implements Servlet{
	
	ServletConfig conf;
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.conf=conf;
		System.out.println("servelet Object initiated");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("servicing.......");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>this is an output from service</h1>");
		out.println("<h1>todays date is" + new Date().toString()+"</h1>");
	}
	@Override
	public void destroy() {
		System.out.println("destroing");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "this is created by me";
	}



}
