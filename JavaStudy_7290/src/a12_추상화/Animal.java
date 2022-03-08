package a12_추상화;

	/*
	 * 추상(abstract)
	 * 추상 메소드, 추상 클래스
	 * 
	 * 추상 메소드 = 반환 자료형, 메소드형, 매개변수 목록/ 만 정의한 메소드(실행문은 정의안함)
	 * public .abstract. void move(); 중괄호 지우고 ; 으로 마친다
	 * 
	 * 추상 클래스 = 클래스 내부에 추상 메소드가 하나라도 존재한다면, 추상 클래스로 정의해야 한다
	 * public .abstract.붙이면 class Animal {
	 * 추상클래스는 생성을 할 수 없다
	 * 추상 메소드가 있다는 것 외에는 일반 클래스와 동일한 형태를 가진다
	 */

public abstract class Animal {	
	public abstract void move(); 
}
