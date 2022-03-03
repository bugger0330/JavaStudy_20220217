package a09_클래스_정보은닉;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c);  //주소값
		c.setModel("k5");
		
		
		///////////////////////////////////////////////////////////////
		String companyAndModel = "kia 자동차 " + c.getModel() + " 차량";
		System.out.println(companyAndModel);
		
		
		
		
		
		
		
	}
}
