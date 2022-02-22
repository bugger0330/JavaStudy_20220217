package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		
		/*
		 * int score 에 점수를 입력받는다
		 * score가 마이너스 점수이거나 100점을 넘으면 X 출력
		 * 90점 이상은 A 등등
		 * 출력 = 성적을 입력해주세요 :  <= 여기서 숫자 입력후 엔터 치면
		 * 학생의 평점은 ?등급입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		
		System.out.print("성적을 입력해주세요 : ");
		
		score = sc.nextInt();
		
		grade = score > -1 && score < 101 ?
				score > 89 ? "A" :
				score > 79 ? "B" :
				score > 69 ? "C" :
				score > 59 ? "D" :
				score > -1 ? "F" : "" :
					 "X";
		
		System.out.println("학생의 평점은 "+ grade + "등급 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
