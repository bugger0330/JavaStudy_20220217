package a00_단축키;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
//		사분면 고르기
		
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		System.out.println("두 수를 입력 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else {
			System.out.println("4사분면");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
