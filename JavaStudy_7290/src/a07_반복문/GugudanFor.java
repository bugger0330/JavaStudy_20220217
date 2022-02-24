package a07_반복문;

public class GugudanFor {

	public static void main(String[] args) {
		
		int dan = 2;
		for(int i = 0; i <9; i++) {
			System.out.println(dan + " X " + (i+1) + " = " + (dan * (i+1)));
		}
		System.out.println("======================");
		
		
		
		for(int i = 0; i < 9; ++i) {
			System.out.println(dan + " X " + (i+1) + " = " + (dan * (i+1)));
		}
		System.out.println("======================");
		
		
		
		for(int i = 0; i < 9;) {
			++i;
			System.out.println(dan + " X " + (i) + " = " + (dan * (i)));
			
		}
		System.out.println("======================");
		for(int i = 0; i < 9;) {

			System.out.println(dan + " X " + (++i) + " = " + (dan * (i)));
			
		}
	}
}
