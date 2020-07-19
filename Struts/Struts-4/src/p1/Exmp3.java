package p1;

import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp3 implements Interceptor {

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		Object o=ai.getAction();
		String username = ((RegisterAction) o).getUsername();
		String userpassword = ((RegisterAction) o).getUserPassword();
		System.out.print(userpassword);
		ActionContext ac = ai.getInvocationContext(); //To user HttpServletREsponse first invoke it 
		HttpServletResponse response=(HttpServletResponse)ac.get("HTTP RESPONSE"); // invoking http response
		if(username.isEmpty()||userpassword.isEmpty())
			response.sendRedirect("/Struts4/errorRegister.jsp");
		String temp=ai.invoke();
		return temp;
	}
}
