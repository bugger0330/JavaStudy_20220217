package a13_인터페이스2.controller;

import java.util.Scanner;

import a13_인터페이스2.model.User;
import a13_인터페이스2.service.UserService;
import a13_인터페이스2.view.Index;
import a13_인터페이스2.view.IndexImpl;
import a13_인터페이스2.view.Input;
import a13_인터페이스2.view.SelectGetUser;
import a13_인터페이스2.view.SelectGetUserImpl;

public class PageController {
	
	private final Input input;
	private final UserService userService;

	public PageController(Input input, UserService userService) {
		
		this.input = input;
		this.userService = userService;
	}
	
	public void index() {
		Index index = new IndexImpl();
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // 메인루프
			index.show();//메인화면 출력
			char select = input.typedSelect(scanner);//재사용이 되니까 만듬 InputImpl 에서 리턴됨
			//메뉴 조건
			if(select == '1') { //회원가입
				User user = input.typedUser(scanner); // user객체 생성 및 객체 데이터 삽입
				userService.addUser(user); // user 추가
				
			}else if(select == '2') { // 회원조회
				selectGetUser();
			}else if(select == 'q') {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당 명령은 실행할 수 없습니다.");
			}
			System.out.println();
		}
	}
	//아이디 1개만 검색해서 정보 출력
	public void selectGetUser() {
		SelectGetUser selectGetUser = new SelectGetUserImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			selectGetUser.show();
			char select = input.typedSelect(scanner);
			
			if(select == '1') {
				User[] users = userService.getUsers();
				
				for(int i = 0; i < users.length; i++) { //user배열에 들어있는 user객체 정보를 전부 출력하라
					if(users[i] == null) {//user배열의 해당 인덱스에 user객체가 없으면 
						//user객체.showUser()메소드를 호출할 수 없기 때문에 continue로 넘기는것
						continue;//밑에꺼 실행하지 마라
					}
					users[i].showUser();//해당 배열에 user객체가 존재하기 떄문에 user정보를 출력
				}
				
				
			}else if(select == '2') { //아이디로 검색
				String username = input.typedUsername(scanner);
				///////////// 이게 실행 되도록
				User user = userService.getUser(username);
				user.showUser();
				//////////////////////////////
			}else if(select == 'b') {
				System.out.println("메인 메뉴로 이동");
				break;
			}else {
				System.out.println("해당 명령은 실행할 수 없습니다.");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
