package a14_최상위클래스;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Computer laptop = new Laptop("삼성", "갤럭시북");
		Object object = new Computer();
		Object object2 = new Laptop("LG", "그램2022");
		((Computer)object).computerTest();
		
		Object[] objs = new Object[2];
		objs[0] = computer;
		System.out.println(computer);
		
		System.out.println(laptop);
		System.out.println(object2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
