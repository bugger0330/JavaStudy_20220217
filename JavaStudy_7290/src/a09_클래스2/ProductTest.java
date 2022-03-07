package a09_클래스2;

public class ProductTest {
	
	public static void test2(Product pp) {
		pp.showProduct();
	}
	
	public static Product test() {
		Product product = new Product();
		product.showProduct();
		product.setProductCode(20220307);
		product.setProductName("모니터");
		
		
		return product;  // 주소를 리턴
	}

	public static void main(String[] args) {
		
		 Product p = test();
		 test2(p);
		
		 Product tumbler = new Tumbler(2000, "스타벅스 텀블러", "오픈식");
		 Product cup = new MugCup(3000, "스타벅스 머그컵", true);
		System.out.println();
		
		tumbler.showProduct();
		cup.showProduct();
		
//		배열
		Product[] products = new Product[2];
		products[0] = tumbler;
		products[1] = cup;
		
		for(int i = 0; i < products.length; i++) {
			products[i].showProduct();
			
			if(products[i] instanceof Tumbler) {
				Tumbler tumbler2 = (Tumbler)products[i];
				tumbler2.tumblerTest();
			}else {
				MugCup cup2 = (MugCup)products[i];
				cup2.mugcupTest();
			}
		}
		
		
		
		
		
		
		
		
	}
}
