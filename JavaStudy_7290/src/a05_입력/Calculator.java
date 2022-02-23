package a05_입력;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		/*
		 * 세 수를 입력받는다 x y z
		 * 출력1- 세 수의 합 : 
		 * 세 수를 다시 입력받고
		 * 출력- 세 수의 곱 :
		 * 세 수를 다시 입력받고
		 * 출력-앞의 두 수의 곱에 세번째 수로 나눈 나머지 값 :
		 *  
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.println("세 수를 입력하세요 : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		System.out.println("세 수의 합 : "+(x+y+z));
		
		System.out.println("세 수를 입력하세요 : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		System.out.println("세 수의 곱 : "+(x*y*z));
		
		System.out.println("세 수를 입력하세요 : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		System.out.println("(x * y) / z 의 나머지 : "+((x*y)%z));
		
		
		
		
		
		
		
		
		
		
	}
}
