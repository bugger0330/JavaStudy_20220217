package a17_제네릭;

import a13_인터페이스3.model.User;

public class GeniricTest {

	public GenericEx<String> getExData(String data) {
		GenericEx<String> ex = new GenericEx<String>(data);
		return ex;
	}
	public GenericEx<User> getExData(User data) {
		GenericEx<User> ex = new GenericEx<User>(data);
		return ex;
	}

	
	public static void main(String[] args) {
		
		GeniricTest geniricTest = new GeniricTest();
		GenericEx<String> ex = geniricTest.getExData("100");
		GenericEx<User> ex2 = geniricTest.getExData(new User("kangmin", "1234", "강민", "a@a.com"));
		System.out.println(ex);
		System.out.println(ex2);
		
		
		
		
		
		
		
		
		
	}
}
