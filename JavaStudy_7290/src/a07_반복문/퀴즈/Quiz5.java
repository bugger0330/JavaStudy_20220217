package a07_반복문.퀴즈;

public class Quiz5 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j =0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j =0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
