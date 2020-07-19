package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private String accno;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custid=request.getParameter("cust_id");
		String pwd=request.getParameter("pwd");
		
		Model m=new Model();
		m.setCustid(custid);
		m.setPwd(pwd);
		boolean status=m.login();
		if(status==true)
		{
			accno=m.getAccno();
			HttpSession session = request.getSession(true); //we are putting data in session so set it as true
			session.setAttribute("accno", accno);
			response.sendRedirect("/BankApp/Loginsuccess.jsp");
		}
		else
			response.sendRedirect("/BankApp/Loginfail.jsp");
	}
}
