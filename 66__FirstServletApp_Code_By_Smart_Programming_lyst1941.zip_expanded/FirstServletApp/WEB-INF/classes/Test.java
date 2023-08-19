import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Test extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//System.out.println("hello Smart Programming");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		out.print("hello Smart Programming...!!");
	}
}