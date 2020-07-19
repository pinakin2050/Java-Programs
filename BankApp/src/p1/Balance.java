package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Balance extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();	//reading sesion
		String accno = (String) session.getAttribute("accno"); //getting AC number from session
		
		try
		{
			Model m=new Model();
			m.setAccno(accno);
			boolean status = m.checkBalance();
		
			if(status==true)
			{	
				session.setAttribute("amt", m.getAmt());
				response.sendRedirect("/BankApp/PrintBalance.jsp");
			}
			else
				response.sendRedirect("/BankApp/PrintBalanceFail.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
