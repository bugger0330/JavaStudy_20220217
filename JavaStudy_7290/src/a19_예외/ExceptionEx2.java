package a19_예외;

import java.io.IOException;
import java.util.ArrayList;

import a18_컬렉션.ArrayList.Student;

public class ExceptionEx2 {

	public void array() throws IOException, IndexOutOfBoundsException, NullPointerException {
		//메소드 이름 뒤에 throws를 붙이면, 메인에서 메소드를 실행하려고 하면 무조건 예외처리를 하라고
		//빨간 밑줄이 뜬다
		//대체로 throws Exception 을 쓴다
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(null);//예외가 발생하면 프로그램이 멈춘다
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());

		for(int i = 0; i < students.size() + 1; i++) {
			Student student = students.get(i);
			student.setName("강민");
			System.out.println(student.getName());
		}
	}
		
	
	public static void main(String[] args) {
		
		ExceptionEx2 ex2 = new ExceptionEx2();
		//ex2.array();
		
			try {
				ex2.array();
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}//이 메소드를 실행할때는 무조건 예외처리를 해라고 함
}
		
		
		
		
		
		
		
		
		
		
		
		// NullPointerException = 참조할 주소가 없어서 뜬 오류
		
//		try {
//			System.out.println("메소드 끝까지 실행됨?");
//		}catch(NullPointerException e) {
//			System.out.println("주소를 참조할 수 없습니다");
//		}catch(Exception e) { //모든 예외의 부모같은 역할, 어떤 오류든 여기서 걸린다
//			e.printStackTrace();
//		}finally {
//			System.out.println("예외가 발생하는 하지 않든, 무조건 실행");
//		}
//		System.out.println("프로그램 종료");
//	}
//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

