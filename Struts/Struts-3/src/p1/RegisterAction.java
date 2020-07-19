package p1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
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
		
		public String execute()
		{
			return "s";//in xml.web file look for result tag with name "s" 
		}

}
