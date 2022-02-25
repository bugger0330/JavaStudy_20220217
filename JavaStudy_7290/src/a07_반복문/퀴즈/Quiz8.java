package a07_반복문.퀴즈;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~ 2001년 까지 
		 * 윤달이면 출력
		 * 윤달이 아니면 출력안함
		 * 윤달 = 4의 배수이면서 100의 배수는 아니고 400의 배수인것
		 */
		
		
		for(int i = 0; i < 2001; i++) {
			int year = i + 1;
			if(!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
				continue;
			}
			System.out.println(year);
		}
		
		
		
		
		
		
		
		
	}
}
