package a09_클래스_정보은닉;

	/*
	 * 접근지정자(AccessModifier)
	 * https://studymake.tistory.com/424
	 * 종류 : 
	 * default : String name; 앞에 아무것도 없는거 / 클래스가 위치하고 있는 패키지 내부(같은 패키지)
	 * protected : default랑 같지만, 만약 다른 패키지에 상속관계가 있다면 다른 패키지의 클래스에 접근가능
	 * public : 어디서나 누구에게서나 접근가능
	 * private : 프라이빗_ 본인 클래스 내부에서만 접근이 가능하다
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
