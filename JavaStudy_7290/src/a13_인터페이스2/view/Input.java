package a13_인터페이스2.view;

import java.util.Scanner;

import a13_인터페이스2.model.User;

public interface Input {

	public char typedSelect(Scanner scanner);
	public User typedUser(Scanner scanner);// 유저 정보를 입력받아 모두 모아서 리턴 해줘야 해서
	public String typedUsername(Scanner scanner);
	
}
