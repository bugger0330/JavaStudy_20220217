package a10_클래스_정보은닉;

	/*
	 * 접근지정자(AccessModifier)
	 * https://studymake.tistory.com/424
	 * 종류 : 
	 * default : String name; 앞에 아무것도 없는거
	 * protected
	 * public
	 * private
	 */

public class AccessModifier {

	String name;
	protected int age;
	public String phone; //전체공개
	private String address; //비공개

	public AccessModifier() {
	// TODO Auto-generated constructor stub
		this.address = "부산";  // 자기 클래스 안에서만 쓸수있다
}
}
