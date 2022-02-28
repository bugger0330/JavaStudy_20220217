package a08_함수;

import java.util.Scanner;

/*
 * 계산기
 * 
 * 첫번째 숫자 입력
 * 사칙연산(+, -, *, /) 입력
 * 
 * 두번쨰 수 입력
 * 
 * 결과를 출력하라
 * 
 * 단, 정수와 실수 모두 계산 가능해야 함
 * 
 * calc() 메서드 사용
 */


public class MethodOverloading2 {

	public static String calc(String num1, String num2, char operator) {
		
		 String result = null; //result가 문자열이기 떄문에 (계산결과)를 다시 문자로 변환
		
		if(operator == '+') {
			result = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
		}else if(operator == '-') {
			result = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
		}else if(operator == '*') {
			result = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
		}else if(operator == '/') {
			result = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
		}else {
			result = "계산 할 수 없는 연산자 입니다";
		}
		
		return result;
	}


	
	//메인 메서드
	public static void main(String[] args) {
	
		boolean ttnn = true;
		
		Scanner sc = new Scanner(System.in);
		String num1 = null;
		String num2 = null;
		char operator = ' ';
		
		System.out.print("첫번쨰 수 입력 : ");
		num1 = sc.next();
		System.out.print("연산할 기호 입력 : ");
		operator = sc.next().charAt(0);
		System.out.print("두번쨰 수 입력 : ");
		num2 = sc.next();
		
		System.out.println("결과1 : "+calc(num1, num2, operator));
		System.out.println("결과2 : "+calc(num1, num2, operator));
	}
}
