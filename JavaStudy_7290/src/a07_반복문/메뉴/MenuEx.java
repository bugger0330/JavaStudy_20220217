package a07_반복문.메뉴;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char select = ' ';
		
		while(true) {
			System.out.println("[회원정보 관리]");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 삭제");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 선택하세요 : ");
			
			select = sc.next().charAt(0);
//			.charAt(0)는 index 0 번째에 있는 글자 하나만 들고 오는 것
			System.out.println("선택값 : "+select);
			
			if(select == '1') {
				
			}else if(select == '2') {
				
			}else if(select == '3') {
				
			}else if(select == 'q') {
				System.out.println("프로그램 종료중...");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
		
		
		
		
		
	}
}
