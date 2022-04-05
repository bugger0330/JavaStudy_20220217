package a21_은행.view;

import java.util.Scanner;

import a21_은행.model.User;

public class InputImpl implements Input {

	@Override
	public User show1() {
		
		User user = new User();
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("<계좌등록>");
		
		System.out.println("아이디 : ");
		user.setUsername(scanner.nextLine());
		System.out.println("비밀번호 : ");
		user.setPassword(scanner.nextLine());
		System.out.println("이름 : ");
		user.setName(scanner.nextLine());
		System.out.println("계좌번호 : ");
		user.setBankNumber(scanner.nextLine());
		System.out.println("계좌 비밀번호 : ");
		user.setBankPassword(scanner.nextLine());
		System.out.println("입금금액 : ");
		user.setMoney(scanner.nextInt());
		
		return user;
	}

}
