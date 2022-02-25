package a07_반복문.메뉴;

import java.util.Scanner;

public class MenuEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char select = ' ';
		boolean firstFlag = true;

		
		while(firstFlag) {
			boolean secondFlag =true;
			System.out.println("[사용자 폴더]");
			System.out.println("1. 바탕화면");
			System.out.println("2. 문서");
			System.out.println("q. 프로그램 종료");
			System.out.println("========================");
			System.out.print("명령 선택 : ");
			select = sc.next().charAt(0);
			
			if(select == '1') {
				while(secondFlag) {
					System.out.println("[바탕화면 폴더]");
					System.out.println("1. 게임");
					System.out.println("2. 교육");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");
					System.out.print("명령 선택 : ");
					select = sc.next().charAt(0);
					
					if(select == '1') {
						System.out.println("게임을 실행합니다");
					}else if(select == '2') {
						System.out.println("교육을 실행합니다");
					}else if(select == 'b') {
						System.out.println("뒤로가기");
						break;
					}else if(select == 'q') {
						System.out.println("프로그램 종료중.....");
						secondFlag = false;
						break;
					}else {
						System.out.println("해당 프로그램 또는 폴더가 존재하지 않습니다.");
					}
					System.out.println("###########################");
				}
				
				
			}else if(select == '2') { //break를 안쓰고 종료하는 법
				
				while(secondFlag) {
					System.out.println("[문서 폴더]");
					System.out.println("1. 그림");
					System.out.println("2. 음악");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");
					System.out.print("명령 선택 : ");
					select = sc.next().charAt(0);
					
					if(select == '1') {
						System.out.println("그림을 실행합니다");
					}else if(select == '2') {
						System.out.println("음악을 실행합니다");
					}else if(select == 'b') {
						System.out.println("뒤로가기");
						secondFlag =false;
					}else if(select == 'q') {
						System.out.println("프로그램 종료중.....");
						secondFlag = false;
						firstFlag = secondFlag;
						
					}else {
						System.out.println("해당 프로그램 또는 폴더가 존재하지 않습니다.");
					}
					System.out.println("###########################");
				}
				
				
			}else if(select == 'q') {
				System.out.println("프로그램 종료중....");
				break;
			}else {
				System.out.println("해당 폴더는 존재하지 않습니다.");
			}
			
		}
		System.out.println("프로그램 종료");
		
		
		
	}
}
