package a09_클래스;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		Computer c1 = null;
		Computer c2 = null;
		
		c1 = new Computer(); //생성(생성자 호출)
		c2 = new Computer(); //또 다른 생성(생성자 호출) , new를 쓰면 새로운 주소의 생성자를 만든다
		System.out.println(c1);
		System.out.println(c2);
		
		c1.model = "삼성컴퓨터";
		c2.model = "LG컴퓨터";
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		c1.printInfo();
		c2.printInfo();
		
		
		
		
		
		
	}

}
