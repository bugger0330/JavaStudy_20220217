package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		
		/*
		 * null은 주소값이 0이다, null 안에는 아무것도 없다, null은 주소값이다
		 * 객체를 배열로 만든다
		 */
		
		User[] users = new User[5];
		
		users[0] = new User("aaa", "1234");
		users[1] = new User("aaa", "1234");
		users[2] = new User("aaa", "1234");
		users[3] = new User("aaa", "1234");
		users[4] = new User("aaa", "1234");
		
		for(int i = 0; i < users.length; i++) {
//			if(users[i] != null) {
//				users[i].showInfo();
//			}
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		System.out.println("=======================================");
		
		int[] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
