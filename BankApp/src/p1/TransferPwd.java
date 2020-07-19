package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransferPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enp = request.getParameter("enp");
		HttpSession session = request.getSession();
		String email=(String)session.getAttribute("email");
		try
		{
			Model m=new Model();
			m.setEmail(email);
			m.setPwd(enp);
			boolean status=m.forgotPassword();
			if(status==true)
				response.sendRedirect("/BankApp/changePwdSuccess.jsp");
			else
				response.sendRedirect("/BankApp/changePwdFail.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
