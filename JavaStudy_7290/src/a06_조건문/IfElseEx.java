package a06_조건문;

public class IfElseEx {

	public static void main(String[] args) {
		
		/*
		 * if 참   else 거짓 실행
		 */
		
		int x = 0;
		int y = 0;
		
		x = 10;
		y = 20;
		
		if(x > y) {System.out.println("x가 y보다 큽니다"); System.out.println("test");}
//		if에 명령어를 여러개 쓰려면 중괄호로 묶어준다
		else System.out.println("x가 y보다 작습니다");
		
		if(x > y) {
			System.out.println("x가 y보다 큽니다"); 
			System.out.println("test");
			}else System.out.println("x가 y보다 작습니다");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
