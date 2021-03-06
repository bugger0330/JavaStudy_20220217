package a04_문자열;

public class StudentInfo {

	public static void main(String[] args) {
		String name = "강민";
		
		/*
		 * 2022년 02월 22일 코리아아이티아카데미부산 학생정보
		 * year   month  day         academy(문자열)   
		 * 학생 이름 : 강민
		 */
		
		int a=2022;
		String year = "" + (++a);//문자열을 숫자로 형변환
		String month = "02";
		String day = "22";
		String academy = "코리아아이티아카데미부산";
		
		System.out.println(Integer.parseInt(year)+1);// 형변환
		System.out.println(year + "년 "+month+"월 "+day+"일 "+academy+" 학생정보");
		System.out.println("학생 이름 : "+name);
		
		/*
		 * 문자열 형병환
		 * 문자열(String) => Integer(int)
		 * Integer.parseInt("100"); => 숫자100으로 변환
		 * Double.parseDouble("15.33"); => 실수15.33으로 변환
		 * Boolean.parseBoolean("true"); => 
		 * 
		 * 정수, 실수, 등등을 문자열로 형변환 하는법
		 * Integer.toString(100); => 문자열 100으로 변환
		 * Double.toString(3.14); => 문자열 3.14
		 * Boolean.toString(true); => 문자열 true로 변환
		 */
		
		int num = Integer.parseInt("100");
		double dNum = Double.parseDouble("3.14");
		System.out.println(dNum + 10);
		System.out.println(num + 20);
		System.out.println(!Boolean.parseBoolean("true"));
		
		String num2=Integer.toString(200);
		System.out.println(num2 + 200);
		
		
		
		
		
		
		
		
	}
}
