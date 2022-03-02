package a09_클래스;

public class StudentTest {

	/*
	 * Student(클래스)
	 * 속성(변수)
	 * schoolName
	 * studentYear
	 * studentGroup
	 * studentNumber
	 * studentName
	 * studentAddress
	 * studentPhone
	 * graduationFlag -- boolean
	 * 
	 * 기능(메소드)
	 * showStudentInfo()
	 * 	학교명 : 부산고등학교
	 * 	학년 : 3
	 * 	반 : 2
	 *  번호 : 10
	 *  이름 : 강민
	 *  주소 : 부산 동래구
	 *  연락처 : 010-0000-0000
	 *  졸업구분 : 기본 -- 재학중,  true(졸업), false(재학중)
	 * 
	 * incrementYear()
	 * 학년 + 1
	 * 만약 학년이 3학년을 넘어서면 graduationFlag = true
	 * boolean 기본값은 false 이다
	 */
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.schoolName = "부산고등학교";
		s1.studentYear = 1;
		s1.studentGroup = 2;
		s1.studentNumber = 10;
		s1.studentName = "강민";
		s1.studentAddress = "부산 동래구";
		s1.studentPhone = "010-0000-0000";
		
		s1.showStudentInfo();
		s1.incrementYear();
		s1.incrementYear();
		s1.incrementYear();
		s1.incrementYear();
		s1.showStudentInfo();
		
		////////////////////////////////////
		System.out.println("===============================");
		Student s2 = new Student("부산고등학교", 1, 2, 10, "강민", "부산 동래구", "010-0000-0000", false);
		s2.schoolName = "부산고등학교";
		s2.studentYear = 1;
		s2.studentGroup = 2;
		s2.studentNumber = 10;
		s2.studentName = "강민";
		s2.studentAddress = "부산 동래구";
		s2.studentPhone = "010-0000-0000";
		
		s2.showStudentInfo();
		s2.incrementYear();
		s2.incrementYear();
		s2.incrementYear();
		s2.incrementYear();
		s2.showStudentInfo();
		
		///////////////////////////
		
		Student s3 = new Student("경남고등학교","강민");
		s3.showStudentInfo();
		
		
		
		
		
	}
}
