package a06_조건문;

import java.util.Scanner;

public class IfElseEx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		
		System.out.print("x축을 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("y축을 입력하세요 : ");
		y = sc.nextInt();
		System.out.println("(" + x + " , " + y + ")");
		
		if(x == 0 && y == 0) {
			System.out.println("원점 입니다");
		}else {
			if(x > 0 && y >0) {
				System.out.println("1사분면 입니다");
			}else if(x < 0 && y > 0) {
				System.out.println("2사분면 입니다");
			}else if(x <0 && y < 0) {
				System.out.println("3사분면 입니다");
			}else {
				System.out.println("4사분면 입니다");
			}
		}
		
		
		
		
		
		
	}
}
