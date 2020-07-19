package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		if(name.isEmpty()||city.isEmpty())
		{
			response.sendRedirect("/Frameworks-Eg1/failPage.jsp");
		}
		else
			response.sendRedirect("/Frameworks-Eg1/successPage.jsp");
	}

}
