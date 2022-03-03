package a09_클래스_정보은닉;

public class UserTest {

	public static void main(String[] args) {
		User u = new User("aaa", "1234", "강민", "aaa@ddd.com"); // 생성할때 값을 넣고 싶으면 User클래스에 오버로딩을 만들어줘야 한다
//		u.setUsername("aaa");
//		u.setPassword("abc23");
//		u.setName("강민");
//		u.setEmail("aaa@bgb.com"); // u.을 하면 생성자 만들고 나서, 후 작업을 하게 되니, 위에 처럼 생성자에 값을 바로 넣도록 할수도 있다
		
	/*
	 * 아이디 : 
	 * 비밀번호 : 
	 * 이름 : 
	 * 이메일 : 
	 * 출력하기	
	 */
		
		System.out.println("아이디 : " + u.getUsername());
		System.out.println("비밀번호 : " + u.getPassword());
		System.out.println("이름 : " + u.getName());
		System.out.println("이메일 : " + u.getEmail());
		
	}
	
}
