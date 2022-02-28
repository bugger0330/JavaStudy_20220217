package a08_함수;

public class FunctionEx {
	//클래스 안에 만든 함수 == 메소드
	
//	int calc(int x, int y, int z)
//	리턴(반환)타입 / 메소드 이름 / (파라미터, 매개변수)

	public static int calc(int x, int y, int z) {//함수 만드는 곳, calc는 함수 이름 지정, int calc는 리턴값이 int라서 int를 쓴것
		int result = x + y;        //조건식
		int result2 = result * z;
		return result2;  // 반환하는 값 , 출력값
	}

	public static void main(String[] args) {
		
//		함수 호출하는법
		int r = calc(10, 20, 30);
		/////////////////////
		System.out.println(r);
		System.out.println(calc(10, 20, 30));
		System.out.println(calc(12, 20, 30));
		System.out.println(calc(13, 20, 30));
		System.out.println(calc(11, 20, 30));
		System.out.println(calc(17, 20, 30));
		
		
		System.out.println("==================");
		
		int result = 10+20;
		int result2 = result * 10;
		
		System.out.println(result2);
		
		result = 30 + 5;
		result2 = result * 5;
		System.out.println(result2);
		
		
		
		
		
		
		
		
	}
}
