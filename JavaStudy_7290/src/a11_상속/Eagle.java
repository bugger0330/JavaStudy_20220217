package a11_상속;

public class Eagle extends Animal {
	
	@Override //어노테이션 /생략되어 있다
	public void move() {
		//super.move(); // 부모의 주소(super) / 원래는 부모<자식 우선순위로 자식을 호출해야 한다
		System.out.println("독수리가 움직입니다."); //재 정의한것
	}
	
	//주석 처리하고 빈공간에 컨트롤 쉬프트 하면 move() 오버라이드 할수 있다
//	public void move() {
//		System.out.println("독수리가 움직입니다.");
//	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘로 날아 올라갑니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
