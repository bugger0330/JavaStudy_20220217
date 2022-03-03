package a09_클래스_정보은닉;

//캡슐화 - 내용을 보호막으로 씌워 보호하는데, 보호막=메소드 이다

public class Encapsulation {
	private String username; //아이디
	private String password; // 비밀번호
	private String provider; //서비스 회사  == google, naver, kakao
	
	public Encapsulation(String password, String provider) {
		super();
		this.password = password;
		this.provider = provider;
	}
	
	public void setUsername(String username) { // 값을 대입할떄
		
		if(provider.equals("kakao")) { // 문자열을 비교할떄는 equals를 써줘야 한다
			this.username = username + "@kakao.com";
		}else if(provider.equals("google")) {
			this.username = username + "@gmail.com";
		}else if(provider.equals("naver")) {
			this.username = username + "@naver.com";
		}else {
			this.username = username;
		}
		
	}
	public String getUsername() { // 값을 뺴낼때, 리턴값을 줘야 함
		return username;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
	}
}
