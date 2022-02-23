package a06_조건문;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {
		
		/*
		 * 세 수중에 가장 큰 수를 찾는 문제
		 * 
		 * 세 수를 입력하세요 : 1 3 5
		 * 
		 * 가장 큰 수는 5 입니다.
		 * 세 수 모두 같습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int result = 0;
		
		
		if(x == y && x == z) {
			System.out.println("세 수 모두 같습니다");
		}else {
			if(x > y && x > z) {
				System.out.println("가장 큰 수는 " + x);
			}else {
				if(y > x && y > z) {
					System.out.println("가장 큰 수는 " + y);
				}else {
					if(z > x && z > y) {
						System.out.println("가장 큰 수는 " + z);
					}
				}
			}
		}
		
		if(x == y && x == z) {
			System.out.println("세 수 모두 같습니다");
		}else {
			if(x > y) {
				result = x;
			}else {
				result = y;
			}
			
			if(result < z) {
				result = z;
			}
		}
		System.out.println("가장 큰 수는 " + result);
	}
}
