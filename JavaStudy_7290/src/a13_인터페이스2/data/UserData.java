package a13_인터페이스2.data;

import a13_인터페이스2.model.User;
import lombok.Data;
@Data
public class UserData {

	private User[] users; 
	private static UserData instance; //싱글톤
	
	private UserData(User[] users) {
		this.users = users;
	}


	public static UserData getInstance(User[] users) {//싱글톤
		
		if(instance == null) {
			instance = new UserData(users); // 계속 새로운 객체를 생성하면 안되니까
		}
		return instance;//배열이 있을때만 생성용
	}

	public static UserData getInstance() {
		return instance;
	}

	public void showUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			System.out.println(users[i]);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
