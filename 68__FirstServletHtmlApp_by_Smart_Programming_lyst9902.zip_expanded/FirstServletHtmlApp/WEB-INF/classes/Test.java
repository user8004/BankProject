import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Test extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		Enumeration<String> headernames=req.getHeaderNames();

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border='1'>");
		
		while(headernames.hasMoreElements())
		{
			String headername=headernames.nextElement();
			String headervalue=req.getHeader(headername);
			out.println("<tr>");
			out.println("<td>"+headername+"</td>");
			out.println("<td>"+headervalue+"</td>");
			out.println("</tr>");
		}

		out.println("</body>");
		out.println("</html>");
	}
}