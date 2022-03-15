package a13_인터페이스3.view;

import java.util.Scanner;

import a13_인터페이스3.model.User;

public class InputImpl implements Input {

	@Override
	public char typedSelect(Scanner scanner) {
		System.out.print("명령을 입력하세요 : ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}

	@Override
	public User typedUser(Scanner scanner) {
		User user = new User();
		System.out.println("[회원가입]");
		System.out.print("회원 아이디 : ");
		user.setUsername(scanner.nextLine());
		System.out.print("회원 비밀번호 : ");
		user.setPassword(scanner.nextLine());
		System.out.print("회원 이름 : ");
		user.setName(scanner.nextLine());
		System.out.print("회원 이메일 : ");
		user.setEmail(scanner.nextLine());
		return user;
	}

}
