package a13_인터페이스3.service;

import a13_인터페이스3.model.User;

public interface UserService {

	public void addUser(User user);
	public User[] getUsers();
	public User getUser(String username);
}
