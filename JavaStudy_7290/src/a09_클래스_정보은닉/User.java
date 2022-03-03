package a09_클래스_정보은닉;

/*
 * username(아이디)
 * password(비밀번호)
 * name 이름
 * email 이메일
 * 선언하고 게터 세터 만들기
 * 정보들만 담는 객체(메소드) 를 Bean 또는 Entity 객체라고 부른다
 */


public class User {

	private String username;
	private String password;
	private String name;
	private String email;
	
	public User() { // 오버로딩을 했을떄는 기본 생성자도 만들어줘야 한다, 왜냐하면 기본생성자는 원래 생략가능한데, 오버로딩을 만들면 기본생성자에 덮어쓰기가 되버린다
		// 컨트롤 쉬프트 누르면 첫번째에 나옴
	}
	
	
	public User(String username, String password, String name, String email) { // 생성자 오버로딩을 하기 위해서 입력해줘야 함, 알트 쉬프트 s, 밑에서 3번째
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
