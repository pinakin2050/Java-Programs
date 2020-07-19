package P1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServletPage extends HttpServlet {
		public void service(HttpServletRequest request,HttpServletResponse response){
			try
			{
				response.sendRedirect("/Servlets/goodDay.html");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
