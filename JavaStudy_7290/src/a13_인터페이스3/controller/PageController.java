package a13_인터페이스3.controller;

import java.util.Scanner;

import a13_인터페이스3.model.User;
import a13_인터페이스3.service.UserService;
import a13_인터페이스3.view.Index;
import a13_인터페이스3.view.Input;

public class PageController {
	
	private final Index index;
	private final Input input;
	private final UserService userService;
	


	public PageController(Index index, Input input, UserService userService) {
		super();
		this.index = index;
		this.input = input;
		this.userService = userService;
	}



	public void index() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			index.show();
			char select = input.typedSelect(scanner);
			if(select == '1') {
				User user = input.typedUser(scanner);
				userService.addUser(user);
			}else if(select == '2') {
				User[] users = userService.getUsers();
				for(int i = 0; i < users.length; i++) {
					if(users[i] == null) {
						continue;
					}
					users[i].showUser();
				}
			}else if(select == 'q') {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당 명령은 실행할 수 없습니다.");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
