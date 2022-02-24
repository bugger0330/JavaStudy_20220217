package a07_반복문;

public class GugudanWhile {
//구구단 2단
//	2 x 1 = 2
//	2 x 2 = 4 ~~~~~~ 출력
	public static void main(String[] args) {
	
		int dan = 2;
		int num = 0;
		int num1 = 0;
		
		while(num < 9) {
			num++;
			System.out.println(dan + " X " + num + " = " + (dan * num));
			
		}
		System.out.println("==========================================");
		
		while(num1 < 9) {
			num1 =+ (++num1);
			System.out.println(dan + " X " + num1 + " = " + (dan * num1));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
