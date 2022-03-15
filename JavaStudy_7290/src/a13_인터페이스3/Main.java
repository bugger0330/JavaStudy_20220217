package a13_인터페이스3;

import java.util.Scanner;

import a13_인터페이스3.controller.PageController;
import a13_인터페이스3.data.UserData;
import a13_인터페이스3.model.User;
import a13_인터페이스3.service.UserServiceImpl;
import a13_인터페이스3.view.IndexImpl;
import a13_인터페이스3.view.InputImpl;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserData userData = new UserData();
		System.out.print("관리할 회원의 수를 입력해 주세요 : ");
		userData.setUsers(new User[scanner.nextInt()]);
		scanner.nextLine();
		
		PageController pageController = new PageController
				(new IndexImpl(), new InputImpl(), new UserServiceImpl(userData));
		
		pageController.index();
		

	}

}
