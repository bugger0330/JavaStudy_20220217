package a06_조건문;

import java.util.Scanner;

public class IfElseEx3 {

	public static void main(String[] args) {
		
		/*
		 * 하나의 수를 입력받아 그 수가 홀수인지 짝수인지를 판별
		 * 그러나 0은 0입니다 로 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		String result = null;
		
		System.out.print("숫자를 입력하세요 : ");
		x = sc.nextInt();
		
		if(x == 0) {
			result = "0";
		}else {
			if(x % 2 == 0) {
				result = "짝수";
			}else {
				result = "홀수";
			}
		}
		
		System.out.println(result + "입니다.");
		
		
		
		
	}
}
