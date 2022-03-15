package a00_단축키;

import java.util.Scanner;

public class Test1 {
	
	/*
	 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
	 * 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		boolean x = true;
		
		while(x) {
			if(a > 100 || a < 0) {
				System.out.println("잘못 입력하셨습니다");
				x = false;
				break;
			}else if(a > 89) {
				System.out.println("점수 : A");
				break;
			}else if(a > 79) {
				System.out.println("점수 : B");
				break;
			}else if(a > 69) {
				System.out.println("점수 : C");
				break;
			}else if(a > 59) {
				System.out.println("점수 : D");
				break;
			}else if(a > 0) {
				System.out.println("점수 : F");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
