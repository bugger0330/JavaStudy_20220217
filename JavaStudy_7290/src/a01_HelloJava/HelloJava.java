package a01_HelloJava;

//주석의 종류 : /** 엔터(여러줄 주석),/* 엔터(여러줄 주석),//(한줄 주석),주석의 단축키 컨트롤 + / 또는 블록설정 후 단축키 사용
//				
/**
 * 
 * 여러줄 주석(클래스 또는 메소드를 설명하는 주석)
 *
 */
/*
 * 여러줄 주석(메모)
 */


public class HelloJava {

	//'문자'
	//"문자열"	
	public static void main(String[] args) {// 프로그램의 시작지점
		//프로그램 실행방법 단축키 컨트롤 + f11
		System.out.println("Hello, java");
		System.out.print("Hello, java\n");
		System.out.println("강민");
		System.out.println();
		System.out.print("이름 : ");
		System.out.println("강민");
		System.out.print("연락처 : ");
		System.out.println("000-0000-0000");
		System.out.print("주소 : ");
		System.out.println("부산 동래구 사직동");
	}

}
