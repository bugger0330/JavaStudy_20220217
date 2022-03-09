package a13_인터페이스2.view;

import java.util.Scanner;

import a13_인터페이스2.model.User;

public class InputImpl implements Input {

	@Override
	public char typedSelect(Scanner scanner) { //명령을 선택 입력 후 해당 입력값 리턴
		System.out.print("명령을 입력하세요 : ");
		char select = scanner.next().charAt(0);
		scanner.nextLine(); // 버퍼 날려줘야 해서
		return select;
		
	}

	@Override
	public User typedUser(Scanner scanner) { //리턴타입이 User
		User user = new User(); // 밑에서 리턴하면, 유저를 만들떄마다 추가됨
		
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

	@Override
	public String typedUsername(Scanner scanner) {
		System.out.println("[아이디로 조회]");
		System.out.print("회원 아이디 : ");
		return scanner.nextLine();
	}


}
