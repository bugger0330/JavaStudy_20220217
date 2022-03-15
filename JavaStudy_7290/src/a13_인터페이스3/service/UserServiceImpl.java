package a13_인터페이스3.service;

import a13_인터페이스3.data.UserData;
import a13_인터페이스3.model.User;

public class UserServiceImpl implements UserService {

	private final UserData userData; 
	
	public UserServiceImpl(UserData userData) {
		super();
		this.userData = userData;
	}

	@Override
	public void addUser(User user) {
		User[] users = userData.getUsers();
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				users[i] = user;
				break;
			}
			
		}
		
	}

	@Override
	public User[] getUsers() {
		// TODO Auto-generated method stub
		return userData.getUsers();
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}


























