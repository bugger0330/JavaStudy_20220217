package a08_함수;

import java.util.Scanner;

/*
 * 메소드명은 printStar(입력받은 별의 갯수) 출력
 * 1보다 작은 음수가 들어왔을 때, 
 * 별의 갯수는 1개 이상을 입력하셔야 합니다 == 출력
 */

public class MethodEx3 {

	public static void printStar(int star) {
		
		if(star < 1) System.out.println("별의 갯수는 1개 이상을 입력하셔야 합니다.");
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star - i - 1; j++) {
			System.out.print(" ");	
			}
			for(int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");
	int starNum = sc.nextInt();
	printStar(starNum);	
		
		
		
		
		
		
		
	}

}
