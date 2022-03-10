package a14_최상위클래스;

import java.util.Objects;

public class Student {

	private int studentYear;
	private int studentGroup;
	private int studentNumber;
	private String name;
	
	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		super();
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
	}
	
	
	/*
	 * Object클래스에 정의되어 있는 hashCode() 메소드는 물리적 주소값을 리턴하는 기능.
	 * hashCode() 메소드를 재정의(override) 한다는 것은 논리적 주소를 만들겠다! 라는 의미
	 * 
	 */
	
	@Override
	public int hashCode() {
//		System.out.println(super.hashCode());
		return Objects.hash(studentYear, studentGroup, studentNumber, name); // 그냥 외워야함 // 논리적 주소
	}
	//이것도 알트 쉬프트 s 하면 해시코드 비교 명령이 있다
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();//해시코드가 같으면 true 리턴
	}

	@Override
	public String toString() {
		return "Student [studentYear=" + studentYear + ", studentGroup=" + studentGroup + ", studentNumber="
				+ studentNumber + ", name=" + name + "]";
	}
	
	//소스코드가 길어지니 앞으로는 메이븐, 롬복이라는 걸 설치해서 관리한다(@~~~ 오버라이드 및 생성자 만들필요 없다)
	
	
}
