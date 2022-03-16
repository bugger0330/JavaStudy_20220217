package a18_컬렉션;

import java.util.ArrayList;

import a13_인터페이스2.model.User;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		/*
		 * ArrayList(userList) User 생성
		 * User객체 3개 생성해서 userList에 add.
		 * 
		 */
		
		ArrayList<User> userList = new ArrayList<User>(); 
		User user1 = User.builder().username("aaa").password("1234").name("강민").email("aaa@aaa.com").build();
		User user2 = User.builder().username("bbb").password("1234").name("강민").email("aaa@aaa.com").build();
		User user3 = User.builder().username("ccc").password("1234").name("강민").email("aaa@aaa.com").build();
		User user4 = User.builder().username("ddd").password("1234").name("강민").email("aaa@aaa.com").build();

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		
		System.out.println("회원 아이디 리스트");
		for(User user : userList) {
			System.out.println(user.getUsername());
		}
		System.out.println("==================");
		System.out.println("회원 비밀번호 리스트");
		for(User user : userList) {
			System.out.println(user.getPassword());
		}
		
		
		System.out.println("=========for문=========");
		for(int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).getUsername());
		}
		
		System.out.println("=========set=========");
		userList.set(0, User.builder().username("ttt").password("2222").build());
		//객체를 생성해서 0번째 인덱스에 덮어쓰기
		
		userList.add(0, User.builder().username("ddd").password("3333").build());
		//인덱스 중간에 삽입한다
		System.out.println(userList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
