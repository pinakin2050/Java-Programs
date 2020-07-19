package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChangePwd extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String npwd = request.getParameter("npwd");
		 HttpSession session = request.getSession(); //getting session
		 String accno = (String)session.getAttribute("accno"); //getting accno from session
		 try
		 {
			 Model m = new Model();
			 m.setAccno(accno);
			 m.setPwd(npwd);
			 boolean status=m.changePwd();
			 
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
