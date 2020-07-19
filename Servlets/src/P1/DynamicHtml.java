package P1;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DynamicHtml extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			PrintWriter pw = response.getWriter();
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<title>Dynamic HTML</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<h1>You've witnesed my first dynamic html page!</h1>");
			pw.println("</body>");
			pw.println("</html>");
			//pw.println("</head>")
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
