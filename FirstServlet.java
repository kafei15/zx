package cn.tedu.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
public class FirstServlet extends GenericServlet {//implements servlet
	public void service(ServletRequest req,ServletResponse res)throws ServletException,java.io.IOException{
	Date date=new Date();
	String datestr=date.toLocaleString();
	res.getWriter().write(datestr);
}}