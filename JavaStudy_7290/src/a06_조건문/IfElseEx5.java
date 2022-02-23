package a06_조건문;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		
		/*
		 * 점수를 입력 받아서 해당 점수가 몇 학점인지 출력하는 문제
		 * 
		 * 점수를 입력해 주세요 : 85
		 * 
		 * 학생의 평점은  B 학점 입니다
		 * 
		 * 점수는 0 ~ 100 사이만 입력이 가능
		 * 
		 * 그 외 값이 들어왔을 떄는 점수는 0~100 사이만 입력이 가능합니다 <==출력
		 * 
		 * 90~100 A ~~
		 * 0~59 F
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
	
		System.out.print("점수를 입력하세요 : ");
		x=sc.nextInt();
		
		if(x < 0 || x > 100) {
			System.out.println("0 ~ 100 사이의 숫자를 입력하세요!");

		}else {
			if(x > 89) {
				System.out.println("학생의 평점은 A 학점 입니다");
			}else {
				if(x > 79) {
					System.out.println("학생의 평점은 B 학점 입니다");
				}else {
					if(x > 69) {
						System.out.println("학생의 평점은 C 학점 입니다");
					}else {
						if(x > 59) {
							System.out.println("학생의 평점은 D 학점 입니다");
						}else {
							if(x > 0) {
							System.out.println("학생의 평점은 F 학점 입니다");
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
