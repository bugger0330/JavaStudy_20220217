package a17_제네릭.User;

import a13_인터페이스2.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyUser extends User {
	
	private String businessNumber;

	public CompanyUser(String username, String password, String name, String email, String businessNumber) {
		super(username, password, name, email);//생성될때 부모 객체에도 주입해야 하니까 쓴다
		this.businessNumber = businessNumber;
	}

	
}
