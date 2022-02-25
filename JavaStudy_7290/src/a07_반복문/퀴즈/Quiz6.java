package a07_반복문.퀴즈;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.print("숫자를 입력하세요 : ");
		x=sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x - i - 1; j++) {
			System.out.print(" ");	
			}
			for(int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
