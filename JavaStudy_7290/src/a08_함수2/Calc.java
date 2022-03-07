package a08_함수2;

import java.util.Scanner;

/*
 * sum, sub, mul, div 메소드 - 덧셈, 뺄셈, 곱셈, 나눗셈 - 매개변수는 2개씩만 받고(정수)
 * 
 * 두 수를 입력 받고
 * 더한 결과 :
 * 뺀 결과 ~~ 출력
 * 매개변수 둘 중에 하나라도 0이면 0을 리턴
 */

public class Calc {
	
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("더한 결과 : " + sum);
	}
	public static void sub(int a, int b) {
		int sub = a - b;
		System.out.println("뺸 결과 : " + sub);
	}
	public static void mul(int a, int b) {
		int mul = a * b;
		System.out.println("곱한 결과 : " + mul);
	}
	
	public static double div(double a, double b) {
		double div = a / b;
		if(a == 0 || b == 0) {
			return 0;
			}
		System.out.println("나눈 결과 : " + div);
		return div;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.print("두 수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		sum(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
