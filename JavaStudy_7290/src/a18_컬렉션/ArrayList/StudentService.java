package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentService {

	private final ArrayList<Student> studentList;
	
	public StudentService(ArrayList<Student> studentList) {
		this.studentList = studentList;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 메소드 정리
	 * 학생 추가
	 * 학생 전체 조회
	 * 학생 이름으로 정보 조회
	 * 학생 정보 수정
	 * 학생 정보 삭제
	 * 
	 */
	//학생 추가
	public void addStudent(String name, String email, String address) {
		Student student = new Student(name, email, address);
		
		studentList.add(student);
		System.out.println(name + " 학생 정보가 추가되었습니다");
	}
	
	//학생 전체 조회
	public void showStudentAll() { //forEach
		System.out.println("[전체 학생 조회]");
		if(studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다");
		}else {
			for(Student ss : studentList) {
				System.out.println(ss);
		}
		
		}
	}
	
	//학생 이름으로 정보 조회
	public void showStudentByName(String name) {
		System.out.println("[" + name + " 학생 정보 조회]");
		
		for(Student student : studentList) {
			if(student.getName().equals(name)) {
				System.out.println(student);
				return;
			}
		}
		System.out.println(name + " 의 학생 정보가 존재하지 않습니다");
	}
	
	
	
	//학생 정보 수정
	
	//메소드 추가해서 만듬
	public boolean isEmpty(String str) { //만약에 email 또는 address가 null 이거나 ""이 들어왔을때 수정하지 말것
		boolean result = false;
		if(str == null || str.equals("")) {
			result = true;
		}
		return result; //boolean 리턴
	}
	
	public void updateStudentByName(String name, String email, String address) {
		System.out.println("[" + name + " 학생 정보 수정]");
		//만약에 email 또는 address가 null 이거나 ""이 들어왔을때 수정하지 말것
		for(Student student : studentList) {
			if(student.getName().equals(name)) {
				if(isEmpty(email) && isEmpty(address)) {
					System.out.println("수정할 정보가 없습니다"); //마커1 끝나면 바로 밑에 리턴됨
				}else { // 하나라도 false이면
					if(isEmpty(email)) { //비었는지 확인
						student.setEmail(email);
					}else if(isEmpty(address)) {
						student.setAddress(address);
					}else {
						student.setEmail(email);
						student.setAddress(address);
					}
					System.out.println(name + " 학생 정보가 수정되었습니다");
					System.out.println();
				}
				return;//마커1
					
			}
		}
		
	}
	
	//학생 정보 삭제
	public void deleteStudentByName(String name) {
		System.out.println("[" + name + " 학생 정보 삭제]");
		for(Student student : studentList) {
			if(student.getName().equals(name)) {
				studentList.remove(student);
				System.out.println(name + " 학생 정보가 삭제되었습니다");
				System.out.println();
				return;
			}
		}
		System.out.println(name + "의 학생 정보가 존재하지 않습니다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
