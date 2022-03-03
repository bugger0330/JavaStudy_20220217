package a09_클래스_정보은닉;

/*
 * 테스트
 * 
 * Student 클래스 정의 하고
 * 
 * 속성
 * studentName
 * studentCode(학번) 20220000 // 1씩 증가
 * studentYear
 * studentName
 * 
 * 생성자(기본, 전체)
 * getter, setter
 * 
 * 메소드 showStudentInfo 출력
 * 
 * 학교명 : 코리아아이티아카데미
 * 학번 : 20220001
 * 학년 : 1
 * 이름 : 강민
 * 
 * 학교명 : 코리아아이티아카데미
 * 학번 : 20220002
 * 학년 : 3
 * 이름 : 강민2
 */


public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setSchoolName("코리아아이티아카데미");
		student1.setStudentCode(20220001);
		student1.setStudentYear(1);
		student1.setStudentName("강민");
		
		Student student2 = new Student();
		student2.setSchoolName("코리아아이티아카데미");
		student2.setStudentCode(20220002);
		student2.setStudentYear(3);
		student2.setStudentName("강민2");
		
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		
		
		
		
		
	}

	private static void showStudentInfo() {
		// TODO Auto-generated method stub
		
	}
}
