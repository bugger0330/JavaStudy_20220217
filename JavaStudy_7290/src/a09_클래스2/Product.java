package a09_클래스2;

	/*
	 * 클래스(틀) - 자동차(객체)
	 * 속성(변수) - 차종, 차량 색상
	 * 기능(메소드) - 앞으로 간다, 기름을 넣는다 등등 / 동사적인것
	 * 틀에 찍어낸 것을 인스턴스 라고 한다
	 * 
	 * <프로그래밍 적인 정의>
	 * 
	 * 클래스를 정의(참조 자료형을 정의한다)
	 * 정의된 클래스를 생성
	 * 생성시에 힙 메모리 영역에 주소를 할당
	 * 
	 */


public class Product {

	private int productCode;
	private String productName;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(int productCode, String productName) {
		super();
		this.productCode = productCode;
		this.productName = productName;
	}



	public int getProductCode() {
		return productCode;
	}




	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public void showProduct() {
		System.out.println("상품코드 : " + productCode);
		System.out.println("상품명 : " + productName);
	}
		
		
	
}
