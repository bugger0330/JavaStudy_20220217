package a21_은행.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
	//아이디, 비번, 이름, 나이, 계좌번호, 
	private String username;
	private String password;
	private String name;
	private String bankNumber;
	private String bankPassword;
	private int money;
	
}
