package a07_반복문.퀴즈;

public class Quiz4 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) { // 1회 실행시 줄 바꿈
			for(int j = 0; j < 5-i-1; j++) { //1회 실행시 공백 추가
				System.out.print(" ");
			}
			for(int k = 0; k < i +1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
