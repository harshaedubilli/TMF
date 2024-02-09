package banking.DTO;

public class UserDTO {
	private int user_id;
	private String username;
	private String password;
	private String user_fullname;
	private String mobile_no;
	private String email_ID;
	private String user_address;
	
	
	
	//getter methods
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	//setter methods
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_fullname() {
		return user_fullname;
	}
	public void setUser_fullname(String user_fullname) {
		this.user_fullname = user_fullname;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	
	
	
	
	//constructor
	public UserDTO(String username, String password, String user_fullname, String mobile_no, String email_ID,
			String user_address) {
		super();
		this.username = username;
		this.password = password;
		this.user_fullname = user_fullname;
		this.mobile_no = mobile_no;
		this.email_ID = email_ID;
		this.user_address = user_address;
	}
	public UserDTO() {
		super();
		
	}

	
}