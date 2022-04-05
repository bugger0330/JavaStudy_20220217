package a21_은행.view;

import a21_은행.model.User;

public class SelectImpl implements Select {

	@Override
	public void show2() {
		User user = new User();
		
		System.out.println("계좌조회");
		System.out.println("아이디 : " + user.getUsername());
		System.out.println("이름 : " + user.getName());
		System.out.println("계좌번호 : " + user.getBankNumber());
		System.out.println("소지금 : " + user.getMoney());
	
	}

}
