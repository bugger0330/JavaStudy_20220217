package a18_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;



public class StudentService {

	private final HashMap<String, Student> studentMap;
	
	public StudentService(HashMap<String, Student> studentMap) {
		this.studentMap = studentMap;
		// TODO Auto-generated constructor stub
	}

	
	//학생 추가
	public void addStudent(String name, String email, String address) {
		Student student = new Student(name, email, address);
		
		studentMap.put(name, student);
		System.out.println(name + " 학생 정보가 추가되었습니다");
	}
	
	//학생 전체 조회
	public void showStudentAll() { //forEach
		System.out.println("[전체 학생 조회]");
		
		if(studentMap.isEmpty()) {
			System.out.println("등록된 학생이 없습니다");
		}else {
			Iterator<String> ir = studentMap.keySet().iterator();
			while(ir.hasNext()) {
				System.out.println(studentMap.get(ir.next()));
		}
			
		}
		
	}
	
	//학생 이름으로 정보 조회
	public void showStudentByName(String name) {
		System.out.println("[" + name + " 학생 정보 조회]");
		
		if(studentMap.containsKey(name)) {
			System.out.println(studentMap.get(name));
		}else {
			System.out.println("등록된 학생이 없습니다");
			
		}
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
		if(studentMap.containsKey(name)) {
		
			if(isEmpty(email) && isEmpty(address)) {
				System.out.println("수정할 정보가 없습니다");
			}else {
				Student student = studentMap.get(name);
				if(isEmpty(email)) {
				student.setEmail(email);
				}else if(isEmpty(address)) {
					student.setAddress(address);
				}else {
					student.setEmail(email);
					student.setAddress(address);
				}
				System.out.println(name + "학생 정보가 수정되었습니다");
			}
		}else {
			System.out.println(name + " 학생의 정보가 존재하지 않습니다");
		}
	}
		

	
	//학생 정보 삭제
	public void deleteStudentByName(String name) {
		if(studentMap.containsKey(name)) {
			studentMap.remove(name);
			System.out.println("학생 정보가 삭제되었습니다");
		}else {
			System.out.println(name + " 학생의 정보가 존재하지 않습니다");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
