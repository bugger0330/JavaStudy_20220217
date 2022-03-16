package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentService service = new StudentService(new ArrayList<Student>());
		
		service.showStudentAll();//전체 리스트 확인

		//학생추가
		service.addStudent("강민", "aaa@aaa.com", "부산");
		service.addStudent("강민2", "aaa@aaa.com", "부산2");
		service.addStudent("강민3", "aaa@aaa.com", "부산3");
		System.out.println("======================");
		
		service.showStudentAll();
		System.out.println("======================");
		//학생 수정
		service.updateStudentByName("강민", "aaa@aaa.com", "부산4");
		service.showStudentByName("강민2");
		System.out.println("===========전체 확인===========");
		
		service.showStudentAll();
		
		//학생 삭제
		service.deleteStudentByName("강민");
		service.showStudentAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
