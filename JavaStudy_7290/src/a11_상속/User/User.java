package a11_상속.User;

//부모 클래스
public class User {

	/*
	 * User 클래스는
	 * username
	 * password
	 * email
	 * 
	 * boolean login(아이디, 비밀번호)  메소드를 가짐
	 * 자기자신의 아이디와 매개변수의 아이디가 같은지 검사
	 * 그리고, 자기자신의 비밀번호와 매개변수의 비밀번호가 같은지 검사 return
	 * 둘 다 같으면 true 리턴
	 * 
	 * --------------------------------------------
	 * 
	 * CompanyUser 클래스는
	 * companyName
	 * companyAddress
	 * companyTel
	 * 
	 * PersonalUser 클래스는
	 * name
	 * phone
	 */
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	private String username;
	private String password;
	private String email;
	
	public User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
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

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean login(String username, String password) {
		if(username.equals(this.username) && password.equals(this.password)) {
			return true;
		}else {
			return false;
		}
	}
	
}
