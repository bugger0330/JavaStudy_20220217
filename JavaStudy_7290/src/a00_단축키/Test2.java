package a00_단축키;

import java.util.Scanner;

/*
	 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
	 * 
	 * A가 B보다 큰 경우에는 '>'를 출력한다.
		A가 B보다 작은 경우에는 '<'를 출력한다.
		A와 B가 같은 경우에는 '=='를 출력한다.
	 */

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		System.out.print("숫자 2개 입력 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			System.out.println(x + " > " + y);
		}else if(x < y) {
			System.out.println(x + " < " + y);
		}else {
			System.out.println(x + " = " + y);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
