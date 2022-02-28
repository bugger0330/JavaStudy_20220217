package a08_함수;

public class MethodEx1 {
	
	public static int outputNumber() {
		return 10;
	}
	
	public static void showName() {
		String name = "강민";
		System.out.println("이름 : "+name);
	}
	
	public static int outputNumber2(int number) { //int number는 지역변수(메소드 안에서만 쓸수 있는 변수)
		return number;
	}

	public static int outputNumber3(int number) {
		if(number % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
		if(name == null) {
			return;
		}
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		int number = outputNumber(); // 메소드 호출
		System.out.println(number);
		showName();
		showName2(null);;
		System.out.println();
		int number2 = outputNumber2(100);
		System.out.println(number2);
		
		int number3 = outputNumber3(11);
		System.out.println(number3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
