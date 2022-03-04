package a10_배열;

public class StudentArray2 {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		students[0] = new Student("강민", 1);
		students[1] = new Student("강민2", 4);
		students[2] = new Student("강민3", 3);
		students[3] = new Student("강민4", 1);
		students[4] = new Student("강민5", 2);
		
		/*
		 * 출력하라
		 * 1학년 ; 2명
		 * 2학년 : 1명
		 * 3학년 : 1명
		 * 4학년 : 1명
		 */
		
		//변수를 배열로 만들어서 만들어라
		
		int[] count = new int[4];


		for(int i = 0; i < students.length; i++) {
			int studentYear = students[i].getStudentYear();
			
			if(studentYear == 1) {
				count[0]++;
				
			}
			if(studentYear == 2) {
				count[1]++;
				
			}
			if(studentYear == 3) {
				count[2]++;
			
			}
			if(studentYear == 4) {
				count[3]++;
			
			}
			
		}
	
		System.out.println("1학년 : " + count[0] + "명");
		System.out.println("2학년 : " + count[1] + "명");
		System.out.println("3학년 : " + count[2] + "명");
		System.out.println("4학년 : " + count[3] + "명");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
