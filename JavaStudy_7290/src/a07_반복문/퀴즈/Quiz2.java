package a07_반복문.퀴즈;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
//		자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//		54321 거꾸로 출력
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.print("숫자를 입력하세요 : ");
		x=sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			
			System.out.println(x - i); // 역순
			
		}
		
		
		
		System.out.println("================");
		int i = 0;
		while(i < x) {
			i++;
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
	}
}
