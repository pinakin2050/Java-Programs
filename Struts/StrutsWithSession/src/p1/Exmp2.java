package p1;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp2 implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("Am entering Exmp1..");		
		ActionContext ic=ai.getInvocationContext();
		HttpServletRequest hsr=(HttpServletRequest)ic.getSession();
		hsr.setAttribute("value2", 200);
		String temp=ai.invoke();
		System.out.println("Exiting Exmp1");
		return temp;
	}

}
