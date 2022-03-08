package a12_추상화;

public class AnimalAbstractTest {

	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
//		Animal animal = new Animal();메소드가 완성되지 않아서 주소 할당을 할 수 없다
		Animal eagle = new Eagle();
		
		
		human.move();
		tiger.move();
		eagle.move();
		
	}
}
