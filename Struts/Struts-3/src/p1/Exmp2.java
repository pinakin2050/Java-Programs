package p1;

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
		System.out.println("Entering Exmp2");
		String temp=ai.invoke();
		System.out.println("Exiting Exmp2");
		return temp;
	}

}
