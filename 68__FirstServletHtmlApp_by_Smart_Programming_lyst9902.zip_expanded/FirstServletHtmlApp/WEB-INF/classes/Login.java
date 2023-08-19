import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		String email2=req.getParameter("email1");
		String pass2=req.getParameter("pass1");

		if(email2.equals("deepak@gmail.com") && pass2.equals("deepak123"))
		{
			out.println("login success");
		}
		else
		{
			out.println("login failed");
		}
	}
}