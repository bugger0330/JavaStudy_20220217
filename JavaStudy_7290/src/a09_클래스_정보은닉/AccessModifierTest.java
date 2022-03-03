package a09_클래스_정보은닉;

import a09_클래스.Student;  // 패키지가 다르면 임폴트를 꼭 해야 한다

public class AccessModifierTest {

	public static void main(String[] args) {
		
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.name = "강민";
		accessModifier.age = 30;
		
//		Student 적고 컨트롤 쉬프트 눌러서 참조할 클래스를 선택
		Student student = new Student();
//		student. 을 눌렀을때 안의 변수가 선택불가능
//		왜냐하면 변수 앞에 아무것도 없으니 default상태이니까.
//		변수를 선택하고 싶으면 변수선언 앞에 public를 붙여야 한다
		
		
		
		
		
		
		
		
	}
}
