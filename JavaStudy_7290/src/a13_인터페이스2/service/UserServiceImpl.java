package a13_인터페이스2.service;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;
//데이터와 컨트롤러 사이에 통로를 만들어준다
public class UserServiceImpl implements UserService {
	
	private final UserData userData;
	
	public UserServiceImpl(UserData userData) {
		this.userData = userData;
	}
	@Override
	public void addUser(User user) {//생성된 유저 데이터 1개를 들고와서
		User[] users = userData.getUsers(); //user배열 주소 가져옴
		for(int i = 0; i < users.length; i++) { // user 배열에서 빈공간이 있으면 입력한 user객체를 배열에 저장하겠다.
			if(users[i] == null) {//인덱스 0에 비어있으면 0번에 데이터를 넣어라, 내용이 있으면 넣지말고 break후 다시 for() 반복으로 인덱스 1번~~
				users[i] = user;
				break;
			}
		}
	}

	@Override
	public User[] getUsers() {
	
		return userData.getUsers();
	}

	@Override
	public User getUser(String username) {
		//반복문을 사용해서 배열에 들어있는 user 객체들 중에 
		//매개변수(우리가 찾고자 하는 username)를 가진 user객체를 return
		
		User[] users = userData.getUsers();
		User user = null;
		for(int i = 0; i < users.length; i++) {
			if(users[i] != null && users[i].getUsername().equals(username)) {
				user = users[i];
				break;
			}
		}
		
		return user;
	}

}

















