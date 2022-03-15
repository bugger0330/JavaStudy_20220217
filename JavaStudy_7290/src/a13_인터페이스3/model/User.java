package a13_인터페이스3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {

	private String username;
	private String password;
	private String name;
	private String email;
	
	
	public String showUser() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
