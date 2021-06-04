import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class info extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	out.print("<br/> client browser:"+req.getHeader("user-agent"));
	out.print("<br/> client IP address:"+req.getRemoteAddr());
	out.print("<br/> client port no:"+req.getRemotePort());
	out.print("<br/> server port no:"+req.getServerPort());
	out.print("<br/> local port no:"+req.getLocalPort());
	out.print("<br/> method used by clinet:"+req.getMethod());
	out.print("<br/> query string:"+req.getQueryString());	
	}
}