package a05_입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		String name = "강민";
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
//		next는 스페이스바 또는 엔터를 만나면 입력을 멈춘다
//		nextLine은 문자열에 빈공간 포함 
		System.out.println(in.next());
		System.out.println(str);
		
		int studentCode = in.nextInt();
		System.out.println(studentCode + 10);
		
		System.out.println();
		
		
		
		
		
		
		
	}
}
