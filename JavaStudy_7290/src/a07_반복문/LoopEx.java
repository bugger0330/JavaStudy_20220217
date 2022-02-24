package a07_반복문;

public class LoopEx {

	/*
	 * while(조건문){반복문};
	 * 반복 될때마다 조건문을 검사해서 false가 되면 반복x
	 * 
	 */
	
	public static void main(String[] args) {
		
//		1~100까지 더한 값은?
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += (++num);
		}
		System.out.println(result);
		
//		int i = 0;
//		while(i < 100) {  이 모양이 기본
//			i++;
//		} 
		int i = 0;
		while(i < 100) {
			System.out.println(i);
			i++;
			System.out.println(i);
		} //
		
		for(int j = 0; j < 100; j++) {
			System.out.println(j);
		}
		
		int k = 0;
		for(; k < 100;) {
			System.out.println(k);
			k++;
		}
		
		
		
		
	}
}
