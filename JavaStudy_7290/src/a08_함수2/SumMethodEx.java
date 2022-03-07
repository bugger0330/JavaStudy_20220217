package a08_함수2;

import java.util.Scanner;

public class SumMethodEx {

	/*
	 * 숫자 4개를 입력받는다
	 * a, b, c, d를 sum에 전달
	 * 숫자 4개를 모두 입력받아서 리턴하여 total 변수를 출력하시오
	 */

	public static int sum(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println("숫자의 합 : " + sum(a, b, c, d));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
