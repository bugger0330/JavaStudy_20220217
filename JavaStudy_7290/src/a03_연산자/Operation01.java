package a03_연산자;

public class Operation01 {
	public static void main(String[] args) {
		int score = 10;
//		score = score + 1;
//		++score;//선 증가 
//		score++;//후 증가
		System.out.println(score++);
		System.out.println(score);//그 다음번쨰에 증가 시켜라
		
		/**
		 * System.out.println(score++); 는
		 * System.out.println(++score); 라는 말이다
		 */
		System.out.println(score);
	}
}
