package a16_스태틱;

import java.time.LocalDate;

public class KIA { // 싱글톤 사용방법
	private static KIA instance;
	private String companyName;
	private int serialNumber;
	
	private KIA() { 
		companyName = getClass().getSimpleName(); //클래스 명만 가져온다
		serialNumber = LocalDate.now().getYear() * 10000; // 오늘 날짜에서 년도만 가져옴, 뒤에 0000을 붙이기 위해
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA(); // 계속 새로운 객체를 생성하면 안되니까
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}
	
	
	
	
	
}
