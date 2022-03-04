package a11_상속;

public class AnimalTest {
	/*
	 * 오버라이드
	 * 부모로부터 상속, 인터페이스의 구현을 했을 때, 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재 정의 하는 것
	 * 
	 * 부모와 자식 중에 우선순위는 자식이다
	 */

	//업캐스팅은 상속을 받았을 때만 가능하다
	//다운캐스팅은 무조건 업캐스팅 된 다음에만 다운캐스팅이 가능하다
	
	public static void main(String[] args) {
		
		Human human = new Human();
		Eagle eagle = new Eagle();
		Tiger tiger = new Tiger();
		
		human.move();
		eagle.move();
		tiger.move();
		
		/////////// 업캐스팅 전 ///////////////
		human.readBooks();
		eagle.flying();
		tiger.hunting();
		
		/////////////////////////////////////////
		/////////////업캐스팅 후
		Animal ah = human;
		Animal ae = eagle;
		Animal at = tiger;
		
		ah.move(); //부모는 책을 읽는다는 것을 가지고 있지 않다
		ae.move();
		at.move();
		
		Human hh = (Human)ah;
		hh.readBooks(); // 다시 휴먼으로 다운캐스팅 하면 리드북을 쓸수 있다
		Eagle ee = (Eagle)ae;
		ee.flying();
		Tiger tt = (Tiger)at;
		tt.hunting();
		
		
		//업캐스팅
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = eagle;
		animals[2] = tiger;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		System.out.println("=====================");
		for(int i = 0; i < animals.length; i++) {
			//instanceof(업캐스팅 되기 전의 자료형을 비교) 반복문을 쓰기 위해서 쓴다
			
			if(animals[i] instanceof Human) {
				Human h = (Human)animals[i];
				h.readBooks();
			}else if(animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
			}else if(animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}
		}
		
		
		
		
		
		
	}
}
