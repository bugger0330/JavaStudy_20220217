package a10_배열;

public class ArrayTest {

	/*
	 * 배열(Array)
	 * 연관된 데이터를 하나의 변수에 그룹핑 해서 관리하는 기법.
	 * 
	 * 배열 선언
	 * 자료형[] 배열변수명 = new 자료형[배열공간의 갯수] // 갯수는 1부터 시작
	 * int[] numbers = new int[10]; // numbers라는 공간을 만드는데 10개의 칸이 있다
	 * user[] Users = new User[3] // 공간만 만드는거다. 인덱스가 아니다
	 * 인덱스는 0부터 시작. 첫번째 공간 불러올땐  ddd[0]
	 */
	
	public static void main(String[] args) {
		
		int[] numbers = new int[10]; // 갯수가 10개이다
		numbers[1] = 100; // 인덱스가 두번쨰{1} 이다
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(numbers[i]);
		}
		
		/*
		 * String 배열 10개의 공간을 생성
		 * 인덱스 0 부터 가나다라..... 넣어서 출력
		 */
		System.out.println("========================");
		
		
		String[] s = new String[11];
		s[0] = "가";
		s[1] = "나";
		s[2] = "다";
		s[3] = "라";
		s[4] = "마";
		s[5] = "바";
		s[6] = "사";
		s[7] = "아";
		s[8] = "자";
		s[9] = "차";
		for(int i = 0; i < s.length +1; i++) { // 배열의 크기를 넘어서는 반복을 하면 에러가 난다
			System.out.println(s[i]);
		}
		
		System.out.println("========================");
		
		int[] numArray = {1, 3, 4, 3};
		int[] numArray2 = new int[100];
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
