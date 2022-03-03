package a10_배열;

public class ArraySumTest {

	public static void main(String[] args) {
		
		/*
		 * numbers 정수배열 1001개를 만든다
		 * 1~1000까지를 각각의 인덱스에 넣고
		 * 
		 * 1~1000까지 출력하고
		 * 1~1000까지 더한 수를 출력(마지막 인덱스에 대입 후 출력)
		 */
		
		int[] numbers = new int[1001];
		
		for(int i = 0; i < numbers.length -1; i++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		
		for(int i = 0; i < 1000; i++) {
			numbers[1000] += i + 1;
		}
		System.out.println("합 : " + numbers[1000]);
		
	}
}
