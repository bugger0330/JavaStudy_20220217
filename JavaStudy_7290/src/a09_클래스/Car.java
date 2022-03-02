package a09_클래스;

public class Car {

	String company;
	String model;
	int oil;
	

	
	public void go() {
		if(oil < 1) {
			oilError();
		}else {
			oil-=1;
			System.out.println("기름이 1 감소하였습니다");
			System.out.println();
		}
		
	}
	public void oiling() {
		if(oil < 1) {
			oilError();
		}else {
		oil += 1;
		System.out.println("기름이 1 증가하였습니다");
		System.out.println();
		}
	}
	
	public void showCarInfo() {
		System.out.println(company + "회사에서 제조한 " + model + "차량의 정보입니다");
		System.out.println("현재 기름은 " + oil + "리터 입니다");
	}
	
	private void oilError() { // 이 클래스 내부에서만 쓸수 있게 만듬 public >> private
		System.out.println("기름이 부족하여 차량의 이동이 불가능합니다.");
	}
	
}
