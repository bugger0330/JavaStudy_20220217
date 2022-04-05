package a21_은행;

import java.util.Scanner;

import a21_은행.controller.BankController;
import a21_은행.view.InputImpl;
import a21_은행.view.InsertImpl;
import a21_은행.view.SelectImpl;

/*
	 * 
	 * 콘솔프로그램(은행)
	 * 1. 회원가입(아이디, 비번, 이름, 나이, 계좌번호, 계좌 비밀번호, 신용등급, 계좌에 들어있는 돈, 소지금)
	 * 2. 로그인(아이디+비번 또는 아이디+비번+계좌번호
	 * 3. 입금
	 * 4. 출금
	 * 5. 송금(다른 사람의 계좌번호, 이름+계좌 들어있는 돈
	 * 6. 대출(등급에 따라 대출 가능한 금액 설정 및 이자율 설정
	 * 7. 시간 경과
	 * 
	 * User 일반유저
	 * Banker 은행원
	 * 
	 */

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankController bankController = new BankController(new InsertImpl(), new InputImpl(), new SelectImpl());
		
		bankController.Insert();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
