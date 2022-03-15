package a13_인터페이스3.view;

public class IndexImpl implements Index {

	@Override
	public void show() {
		System.out.println("[회원정보 관리 프로그램]");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원조회");
		System.out.println("q. 프로그램 종료");
	}

}
