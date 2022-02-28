package a08_함수;

/*
 * <오버로딩의 개념>
 * 
 * (공통) 메서드의 이름을 재 사용할 수 있다.(매개변수 갯수만 다르면 같은 이름을 쓸 수 있다)
 * 
 * 요리사에게 음식재료 3개를 주면, 3개를 가지고 요리를 해야하고
 * 1개를 주면 1개의 재료로 요리를 해야 한다
 * 
 * 특징1. 매개변수의 갯수에 따라 메서드를 정의 할 수 있다.
 * 
 * 요리사에게 재료 2개를 주고, 도구 1개를 전달(자료형이 다름)
 * 특징2. 매개변수의 자료형이 다르면 매개변수의 갯수가 같아도, 같은 이름의 메서드를 정의 할 수 있다
 */

public class MethodOverloading {

	//첫번째 특징
	public static void sum() {
		System.out.println("매개변수가 없습니다");
	}
	public static void  sum(int a) {
		System.out.println(a + "을 출력합니다");
	}
	public static void sum(int a, int b) {
		System.out.println("a와 b의 합 : " + (a+b));
	}
	
	
	//두번째 특징
	
	public static void sum(int a, double b) {
		System.out.println("a와 b의 합 : " + (a+b));
	}
	
	public static void sum(String a, double b) {
		System.out.println("a와 b의 합 : " + (Double.parseDouble(a)+b)); //문자를 숫자로 변환해야 계산이 되니까
	}
	
	//메인 메서드
	public static void main(String[] args) {
		
		sum();
		sum(1);
		sum(1,2);
		sum(1,1.2);
		sum("22",10.2);
		
		
		
		
		
		
		
		
		
		
	}
}
