package lockMe;

public class Userdetails {
	private String username;
	private String password;
	private String sitename;
	private String loggedInUser;
	
	public Userdetails() {
		// TODO Auto-generated constructor stub
	}

	public  Userdetails(String sitename, String loggedInUser, String username, String passowrd) {
		this.sitename = sitename;
		this.username = username;
		this.password = passowrd;
		this.loggedInUser = loggedInUser;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getSitename() {
		return sitename;
	}
	
	public void setSitename(String sitename) {
		this.sitename = sitename;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	@Override
	public String toString() {
		return 	"Userdeatils [ sitename =" + sitename + ", username = "+ username + ", password = " + password + ", loggedInUser = " + loggedInUser + "]";
	}
}
