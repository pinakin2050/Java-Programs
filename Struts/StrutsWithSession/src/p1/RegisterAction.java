package p1;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String username;
	private String userpassword;
	private HttpServletRequest hsr;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userpassword;
	}
	public void setUserPassword(String userpassword) {
		this.userpassword = userpassword;
	}
		
	public String execute()
	{
		System.out.println(hsr.getAttribute("value1"));
		System.out.println(hsr.getAttribute("value2"));
		return "s";//in xml.web file look for result tag with name "s" 
	}
	
	public void setServletRequest(HttpServletRequest joy)
	{
		this.hsr=joy;
	}
}

