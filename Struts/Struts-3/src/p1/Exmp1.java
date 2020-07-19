package p1;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp1 implements Interceptor {

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
		System.out.println("Entering Exmp1");
		String temp=ai.invoke();
		System.out.println("Exiting Exmp1");
		return temp;
	}

}
