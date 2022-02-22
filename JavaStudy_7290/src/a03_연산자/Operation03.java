package a03_연산자;

public class Operation03 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int result1=num1 < num2 ? 1 : 2;
		
		System.out.println(result1);
		
		boolean result2=num1 > num2 ? true : false;
		System.out.println(result2);
		
		////////////////////////
		
		int score = 851;
		//조건이 참일 경우 조건을 새로 시작
		//큰것부터 하나씩 잘라내야 함
		char grade = score < -1 && score < 101 ? //score가 0 이하, 100 이상 걸러내기
				score > 89 ? 'A' : //90 ~ 100
				score > 79 ? 'B' : //80 ~ 90				
				score > 69 ? 'C' : //70 ~ 80
				score > 59 ? 'D' : //60 ~ 70
				score > -1 ? 'F' : ' ' //참 거짓 세트를 맞춰야 해서 ' '를 적음
					: 'X'; //최초 조건문의 거짓
		System.out.println(grade);
		
		
	}
}
