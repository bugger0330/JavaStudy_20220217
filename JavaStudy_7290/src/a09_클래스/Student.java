package a09_클래스;

public class Student {
	
	//변수를 부르는 말 : 속성, 래퍼런스 변수, 필드
	
	String schoolName;
	int studentYear;
	int studentGroup;
	int studentNumber;
	String studentName;
	String studentAddress;
	String studentPhone;
	boolean graduationFlag;
	
	public void showStudentInfo() {
		
	
		System.out.println("학교명 : " + schoolName);
		System.out.println("학년 : " + studentYear);
		System.out.println("반 : " + studentGroup);
		System.out.println("번호 : " + studentNumber);
		System.out.println("이름 : " + studentName);
		System.out.println("주소 : " + studentAddress);
		System.out.println("연락처 : " + studentPhone);
		System.out.println("졸업구분 : " + (graduationFlag == true ? "졸업" : "재학중"));
		System.out.println();
	}
	
	public void incrementYear() {
		
		studentYear++;
		if(studentYear > 3) {
			studentYear = 3;
			graduationFlag = true;
		}
	}
	
	////////////////////////////////////////////////////
	
	public Student() { // 기본 생성자 (컨트롤 쉬프트 누르면 나옴)
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자 호출");
	}
//	public Student(String schoolName,
//			int studentYear,int studentGroup,int studentNumber,String studentName,
//			String studentAddress,String studentPhone,boolean graduationFlag) { // 전체 필드 생성자
//		this.schoolName = schoolName; // this. 나의 주소
//	}

	
//	<오버로딩>
	public Student(String schoolName, int studentYear, int studentGroup, int studentNumber, String studentName,
			String studentAddress, String studentPhone, boolean graduationFlag) { 
//			String - 참조 자료형(클래스 이기도 하다)  /  나머지 노란 글자들 int boolean 등등은 기본 자료형
		
		//super(); // 지워도 된다(자동생성)
		this(); // 기본생성자를 호출하는 키워드
		this.schoolName = schoolName;
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		this.graduationFlag = graduationFlag;
		//알트 쉬프트 s -> 밑에서 3번쨰꺼 선택하면 자동으로 만들어진다
		
	}

	public Student(String schoolName, String studentName) {
		super();
		this.schoolName = schoolName;
		this.studentName = studentName;
	}
	
	
}
