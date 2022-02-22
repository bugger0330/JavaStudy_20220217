package a05_입력;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
//		import 단축키 = 컨트롤 쉬프트 o
		
		/*
		 * username(아이디) 문자열
		 * password(비밀번호) 문자열
		 * year(년도) 숫자
		 * month(월) 숫자
		 * day(일) 숫자
		 * name(이름) 문자열
		 * adress(주소) 부산 동래구 사직동
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		String username = scan.next();
		
		System.out.println("비밀번호를 입력하세요 : ");
		String password = scan.next();
		
		System.out.println("년도를 입력하세요 : ");
		int year = scan.nextInt();
		
		System.out.println("해당월을 입력하세요 : ");
		int month = scan.nextInt();
		
		System.out.println("오늘날짜를 입력하세요 : ");
		int day = scan.nextInt();
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		////////// 중요
//		next는 글자 입력 후 엔터를 누르면 엔터 앞 까지만 저장되고 엔터키/스페이스키 를  buffer에 저장해둔다
//		nextLine은 엔터나 스페이스를 만나면 무조건 그걸 먹고 끝낸다
//		buffer는 저장공간, 버퍼링의 버퍼
//		buffer 쓰는 이유 = 
		
		scan.nextLine(); // 변수를 지정하지 않았기 때문에 엔터만 먹고 종료된다
		System.out.println("주소를 입력하세요 : ");
		String adress = scan.nextLine();
		
		
		System.out.println("아이디 : "+ username);
		System.out.println("비밀번호 : " + password);
		System.out.println(year+"년 "+ month + "월 " + day + "일");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + adress);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
