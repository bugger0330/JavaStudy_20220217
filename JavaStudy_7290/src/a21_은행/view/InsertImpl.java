package a21_은행.view;

public class InsertImpl implements Insert {

	@Override
	public void show() {
		
		System.out.println("<은행 업무 리스트>");
		System.out.println("1. 계좌등록");
		System.out.println("2. 계좌조회");
		System.out.println("q. 프로그램 종료");
	}

}
