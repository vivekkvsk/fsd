package lockMe;

public class users {
	
	private String username;
	private String password;
	
	public users() { }
	
	public users(String username, String password) {
		super();
		this.username = username;
		this.username = password;
	}
		
		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}
		public  String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public  String toString() {
			return "Users [ username =" + username + ", password=" + password + "]";
		}
}
