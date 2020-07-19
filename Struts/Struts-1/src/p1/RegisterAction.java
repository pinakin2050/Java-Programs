package p1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String username;
	private String usercity;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
		
	public void validate()
	{
		if(username.length()==0)
			addFieldError("username", "The field can't be empty!");//give error msg on the Username text box
		if(usercity.length()==0)
			addFieldError("usercity", "The field can't be empty!");//give error msg on the Usercity text box
	}
	public String execute()
	{
		return "s";//in xml.web file look for result tag with name "s" 
	}
}

