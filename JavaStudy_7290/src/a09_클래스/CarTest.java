package a09_클래스;

/*
 * Car 클래스 정의
 * 속성(변수)
 * company
 * model
 * oil
 * 
 * 메소드
 * void go()
 * 기름 = -1;
 * 기름이 1 감소하였습니다
 * 
 * void oiling()
 * 기름 = +1;
 * 기름이 1 증가하였습니다
 * 
 * void showCarInfo()
 * ooo회사에서 제조한 ooo차량의 정보입니다
 * 현재 기름은 ooo리터 입니다
 * 
 * oil = 5;
 * go(); 호출하다가 기름이 0보다 작으면
 * 기름이 부족하여 차량의 이동이 불가능합니다
 * void oilError()
 * 		
 */

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car(); // Car 는 클래스다/ 클래스 변수; 이건 변수에 주소값 저장하는거
		Car c3; //변수 선언(Car 참조 자료형) ***참조자료형은 주소값이다*** 즉 c1 c3 안에는 주소값만 들어있다
		c3 = new Car(); //Car 객체 생성 >> 힙 메모리 영역에 Car 클래스 사이즈 만큼 메모리를 빌려 할당하는 것
//		c3. 점 찍으면 주소를 찾아가서 그 안에 들어있는 변수, 메소드에 접근할수 있다
		
		c1.company = "KIA";
		c1.model = "K5";
		c1.oil = 5;
		
		c1.showCarInfo();
		c1.go();
		c1.showCarInfo();
		c1.oiling();
		c1.showCarInfo();
		c1.go();
		
		c1.go();
		c1.oiling();
		c1.showCarInfo();
		
		Car c2 = new Car();
		c2.company = "현대";
		c2.model = "아반떼";
		c2.oil = 5;
		
		c2.showCarInfo();
		c2.go();
		c2.showCarInfo();
		c2.oiling();
		c2.showCarInfo();
		c2.go();
		
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.oiling();
		c2.showCarInfo();
		
		
		
		
		
		
		
		
		
		
		
	}
}
