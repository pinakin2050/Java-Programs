package p1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String username;
	private String userpassword;
	
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
		
	public void validate()
	{
		
		if(username.isEmpty())
			addFieldError("username", "The field can't be empty!");//give error msg on the Username text box
		if(userpassword.isEmpty())
			addFieldError("userpassword", "The field can't be empty!");//give error msg on the Userpassword text box
			
	}
	public String execute()
	{
		return "s";//in xml.web file look for result tag with name "s" 
	}
}

