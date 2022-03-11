package a16_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
	 * 스태틱(static)이란?
	 * 해당 클래스 내에서 한번 선언되면 계속 공유되는 영역
	 * 
	 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {

//	private static int autoincrement; //변하면 안되니까 private로 줌
//	private int serialNumber = 20220000;
	
//	public Car() {
//		serialNumber += (autoincrement++);
//	}
//	
//	public static int getAutoincreament() {
//		return autoincrement;
//	}
	
	private int serialNumber;
	private String company;
	private String model;
	
}
