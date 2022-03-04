package a11_상속;

public class Test1 extends Test {

	public Test1() {
		super("a"); //생략되있지만, 안보일뿐 부모가 먼저 호출
		System.out.println("자식1번 클래스 생성");
	}
}
