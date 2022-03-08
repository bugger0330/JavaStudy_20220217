package a12_추상화;

	/*
	 * 익명 클래스, 무명 클래스
	 * 자식클래스를 정의하지 않는다
	 * 한번만 사용하고 끝인 클래스를 만드는것
	 * 
	 */


public class AnonymousClass { // Anonymous 뜻 : 이름이 없다

	public static void main(String[] args) {
		
		Animal animal1 = new Animal() {
			
			@Override
			public void move() {
				// TODO Auto-generated method stub
			System.out.println("토끼가 뜁니다");
			}
		};
		
		animal1.move();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
