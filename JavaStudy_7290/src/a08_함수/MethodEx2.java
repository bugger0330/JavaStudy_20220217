package a08_함수;

import java.util.Scanner;

/*
 * num = 숫자 입력
 * 홀수면 홀수 입니다 출력
 * 짝수면 짝수 입니다 출력
 * 0이면 0입니다 출력
 */

public class MethodEx2 {

	public static int output1(int num) {
	
		if(num == 0) {
			System.out.println("0 입니다");
			return 0;
		}else if(num % 2 == 1) {
			System.out.println("홀수 입니다");
			return 1;
		}else {
			System.out.println("짝수 입니다");
			return 2;
		}
		
	}
	
	public static void printObbAndEven(int num) {
		if(num == 0) {
			System.out.println("0 입니다");
		}else if(num % 2 == 1) {
			System.out.println("홀수 입니다");
		}else {
			System.out.println("짝수 입니다"); // void는 return을 써도 되고 안써도 된다. return을 쓰게되면 거기서 break가 되 버린다
		} // 여기서는 else까지 조건을 파악해야 하니 리턴을 쓰지 않았다
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		printObbAndEven(number); // 메소드 호출
		
		
		output1(number); // 내가 한 거
	}
	
}
