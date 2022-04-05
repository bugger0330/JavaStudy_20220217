package a21_은행.controller;

import java.util.Scanner;

import a21_은행.view.Input;
import a21_은행.view.Insert;
import a21_은행.view.Select;

public class BankController {

	public final Insert insert;
	public final Input input;
	public final Select select;
	


	public BankController(Insert insert, Input input, Select select) {
		super();
		this.insert = insert;
		this.input = input;
		this.select = select;
	}
	
	public void Insert() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String b = null;
			insert.show();
			b = scanner.nextLine();
			if(b.equals("1")  ) {
				input.show1();
			}else if(b.equals("2")) {
				select.show2();
			}else {
				System.out.println("프로그램이 종료 되었습니다");
				break;
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
