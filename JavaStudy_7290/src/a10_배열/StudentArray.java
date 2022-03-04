package a10_배열;

public class StudentArray {

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
		
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		
//		for(int i = 0; i < students.length; i++) {
//			if(students[i].getStudentYear() == 1) {
//				count += 1;
//			}
//			if(students[i].getStudentYear() == 2) {
//				count2 += 1;
//			}
//			if(students[i].getStudentYear() == 3) {
//				count3 += 1;
//			}
//			if(students[i].getStudentYear() == 4) {
//				count4 += 1;
//			}
//			
//		} 이것도 맞지만 밑에꺼가 정답
		
		for(int i = 0; i < students.length; i++) {
			int studentYear = students[i].getStudentYear();
			if(studentYear == 1) {
				count++;
			}
			if(studentYear == 2) {
				count2++;
			}
			if(studentYear == 3) {
				count3++;
			}
			if(studentYear == 4) {
				count4++;
			}
		}
		
		System.out.println("1학년 : " + count);
		System.out.println("2학년 : " + count2);
		System.out.println("3학년 : " + count3);
		System.out.println("4학년 : " + count4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
