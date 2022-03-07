package a09_클래스2;

public class Tumbler extends Product {
	private String cap; //버튼식, 오픈식

	public Tumbler(int productCode, String productName, String cap) {
		super(productCode, productName);
		this.cap = cap;
	}
	
	public void tumblerTest() {
		System.out.println("텀블러만 가지고 있는 메소드");
	}
	
	@Override
	public void showProduct() {
		// TODO Auto-generated method stub
		super.showProduct();
		System.out.println("뚜껑타입 : " + cap);
		System.out.println();
	}


}
