package com.chapterone.simpleservlet;

import java.io.*;
import javax.servlet.*;;

public class SimpleServlet extends GenericServlet  {

	public void  service (ServletRequest req , ServletResponse  resp) throws ServletException , IOException 
	{
		PrintWriter wr = resp.getWriter();
		resp.setContentType("text/html");
		wr.print("<B>Message!" + "\n");
		wr.print("\n" + "Class Name "  + " "+ getClass());
		wr.print("\n\n" + "Servlet Name "  + " "+ getServletInfo());
		
		wr.close();
	}
}
