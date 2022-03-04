package a11_상속;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		//업캐스팅, 자식 => 부모로 변하는것
		Test t1 = test1;
		Test t2 = test2;
		//////////////////////////
		Test[] tArray = new Test[2];
		tArray[0] = test1;
		tArray[1] = test2;
		
		
		//캐스팅 : 형변환을 하는것(타입을 변환 하는거)
		
		//다운캐스팅, 부모 => 자식으로 다시 돌아가는것
		Test1 tt1 = (Test1)t1;
//		Test1 tt1 = (Test1)t1; 앞에 Test1은 자료형식을 말한다
		Test2 tt2 = (Test2)t2;
		
		//잘못된 다운캐스팅
		Test ttt = new Test(); //부모 클래스에 자식클래스가 없기 때문에
		Test1 ttt1 = (Test1)ttt; //안된다
		
		//잘못된 다운캐스팅2
		Test1 tttt1 = new Test1();
		Test tttt = tttt1; //업캐스팅, 이건 되는데
		Test2 tttt2 = (Test2)tttt; // 부모 주소가 달라서 안된다
	}
}
