package a14_최상위클래스;

public class EqualsAndHahscode {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, 1, 1, "강민");
		Student s2 = new Student(1, 1, 1, "강민");
		
//		s1.hashCode();
//		s2.hashCode(); //주소값을 숫자로 리턴하는 메소드

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());//오버라이드에서 같은값을 리턴해서 해시코드 값이 같다
		
		
		
		
		System.out.println(s1 == s2); //주소값 비교 false
		System.out.println(s1.equals(s2)); //현재는 주소값 비교 / 원래는 false지만 Student에 오버라이드 수정해서 true
		
//		true로 만들려면
		
		
		
		
		
		
	}
}
