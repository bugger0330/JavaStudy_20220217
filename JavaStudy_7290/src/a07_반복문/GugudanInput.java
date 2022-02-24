package a07_반복문;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		
//		구구단 만들기
		
		/*
		 * 몇단 부터 몇단 까지 출력할지 입력 받는다
		 * start index: 5
		 * end index: 8
		 * 5단부터 8단까지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		

		System.out.print("start index : ");
		x = sc.nextInt();
		System.out.print("end index : ");
		y = sc.nextInt();
		int i = x;

		
		/*
		 * for(int i = x; i < (y + 1); i++) {
		 * 
		 * System.out.println(i + "단"); 
		 * 		for(int j = 1; j < 10; j++) {
		 * System.out.println(i + " X " + j + " = " + (i * j)); } System.out.println();
		 * }
		 */
		
		while(i < (y + 1)) {
			System.out.println((i) + "단");	
			i++;
			int j = 0;
			while(j < 9) {
				j++;
				System.out.println((i-1) + " X " + (j) + " = " + ((i-1) * j));
			}
			System.out.println();
		}
//		
//		while(i < 8) {
//			int dan = i + 2;
//			System.out.println(dan + "단");
//			int j = 0;
//		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
