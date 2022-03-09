package a13_인터페이스2.view;

public class IndexImpl implements Index {// Index 인터페이스를 구현하는 클래스

	@Override
	public void show() {
		System.out.println("[회원 정보 관리 프로그램]");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 조회");
		System.out.println("q. 프로그램 종료");
	} 

}
