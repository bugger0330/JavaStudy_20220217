package a08_함수2;

import java.util.Scanner;

/*
	 * 숫자 3개를 입력받는다 10 11 12
	 * oddAndEven(정수 1개)
	 * 받은 정수가 홀수인지 짝수인지 구분해서
	 * 홀수 : true
	 * 짝수 : false를 리턴
	 * 
	 * 출력
	 * 10 = "짝"
	 * 11 = "홀"
	 */

public class OddAndEven {
	
	public static boolean oddAndEven(int num) {
		boolean pp = num % 2 == 0 ? true : false;
		if(pp == true) {
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
		
		return pp;
	}
	
	public static void printResult(int num) {
		System.out.println(oddAndEven(num));
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
				
		System.out.print("3개의 숫자를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		oddAndEven(a);
		oddAndEven(b);
		oddAndEven(c);
		System.out.println("==================");
		printResult(a);
		printResult(b);
		printResult(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
