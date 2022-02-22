package a03_연산자;

public class Operation04 {

	public static void main(String[] args) {
		/**
		 * 논리연산자(boolean) true 1, false 0
		 * AND, OR, NOT
		 * AND - && - 곱
		 * OR - || - 합
		 * NOT ! - 부정
		 * 
		 * true && true = true
		 * true && false = false
		 * 
		 * true || true = true
		 * true || false = true
		 * false || false = false
		 * 
		 * !(true || false) = false
		 * !true || false = false
		 * 
		 */
		
		int score = -10;
		boolean result;
		//score가 음수도 안되고 100 초과도 안된다 - false
		result = !(score < 0 || score > 100);
		System.out.println("결과 : "+result);
		
		///////////////////////////////////
		
		
		char grade = 'a';
		// grade 소문자여도 되고 대문자여도 되는데 a,b,c,A,B,C 만 가능
		result = (grade =='a' || grade == 'b' || grade=='c' || grade=='A' || grade=='B' || grade=='C');
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
