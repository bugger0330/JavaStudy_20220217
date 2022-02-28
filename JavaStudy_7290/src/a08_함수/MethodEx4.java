package a08_함수;

import java.util.Scanner;

/*
 * 메소드명은 printStar(입력받은 별의 갯수) 출력
 * 1보다 작은 음수가 들어왔을 때, 
 * 별의 갯수는 1개 이상을 입력하셔야 합니다 == 출력
 */

public class MethodEx4 {

	public static void printStar1(int star) {
		
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
	
	
	public static void printStar2(int star) {
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printStar3(int star) {
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	
	public static void printStar4(int star) {
		for(int i = 0; i < star; i++) {
			for(int j =0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j =0; j < star - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printStar5(int star) {
		for(int i = 0; i < star; i++) { // 1회 실행시 줄 바꿈
			for(int j = 0; j < star-i-1; j++) { //1회 실행시 공백 추가
				System.out.print(" ");
			}
			for(int k = 0; k < i +1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
	/////////////////////////////////////////////////////
	
	/*
	 * 반복 횟수 입력 : 10
	 * 별찍기 모양 선택(1 ~ 5) : 
	 * 만약 1 ~ 5의 수가 안들어 왔을때, 정상적인 값이 들어올때 까지 계속 입력받기
	 * 정상적인 값이 들어왔을떄는 해당 별 찍기를 실행
	 */
	
	public static void main(String[] args) {
		
	boolean ttnn = true;
	
	while(ttnn) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("별찍기 모양을 선택하세요(1 ~ 5) : ");
		int num2 = sc.nextInt();
		if(num2 < 1 || num2 >5) {
			System.out.println("잘못 입력하셨습니다");
			ttnn = true;
		}else if(num2 == 1) {
			printStar1(num1);
		}else if(num2 == 2) {
			printStar2(num1);
		}else if(num2 == 3) {
			printStar3(num1);
		}else if(num2 == 4) {
			printStar4(num1);
		}else {
			printStar5(num1);
		}
		System.out.println();
		
		
	}
	
		
		
		
		
		
	}

}
