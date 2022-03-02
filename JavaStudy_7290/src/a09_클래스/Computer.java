package a09_클래스;

public class Computer {
	
//	틀을 만드는 법
	String model;
	
	
	
	
	
	/////////////////////////////////////////////
	public Computer() { // 리턴값은 주소값이다(리턴은 생략되어있다. <= 자료형이 없는 이유)
		
		System.out.println("컴퓨터 객체를 생성합니다.");  // 실행 후 주소값을 리턴한다
		
		
	}
	
	public void printInfo() {
		System.out.println("컴퓨터 모델 : " + model);
	}

}
