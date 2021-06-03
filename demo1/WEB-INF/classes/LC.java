import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LC extends GenericServlet
{
	public void init(ServletConfig config)throws ServletException
	{
		System.out.println("init");
	}

	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
		System.out.println("from service");
		PrintWriter out=response.getWriter();
		out.println("<h1>from service</h1>");
		out.println("<p>twinkle twinkle little star*****</p>");
	}

	public void destroy()
	{
		System.out.println("destroy");
	}
}