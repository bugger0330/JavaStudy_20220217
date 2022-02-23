package a06_조건문;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		/*
		 * score = 85
		 * 90 ~ 100 = A ~~~~~~
		 * 0 ~ 59 = F
		 */
		
		int score = 85;
		
		switch(score / 10) {
			case 10 :
			case 9 :
				System.out.println("A 학점 입니다");
				break;
			case 8 :
				System.out.println("B 학점 입니다");
				break;
			case 7 :
				System.out.println("C 학점 입니다");
				break;
			case 6 :
				System.out.println("D 학점 입니다");
				break;
			default :
				System.out.println("F 학점 입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
