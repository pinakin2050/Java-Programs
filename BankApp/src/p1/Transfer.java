package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String recepient = request.getParameter("tacc");
		String amt = request.getParameter("amt");
		HttpSession session = request.getSession();
		String accno = (String)session.getAttribute("accno");
		
		try
		{
			Model m=new Model();
			m.setAccno(accno);
			m.setAmt(amt);
			m.setRecepient(recepient);
			if(m.credit())
				System.out.println("Credited successfully");
			else
				System.out.println("Transfer Failure!!");
			
			boolean status = m.transfer();
			if(status=true)
				response.sendRedirect("/BankApp/transferSuccess.jsp");
			
			else
				response.sendRedirect("/BankApp/transferFail.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
