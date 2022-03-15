package a17_제네릭;

import a13_인터페이스2.model.User;
import a17_제네릭.User.CompanyUser;
import a17_제네릭.User.PersonalUser;

public class ControllerTest {
	
	public CMRespDto<? extends User> getProfile(String username){ //? extends User 하게 되면 밑으 <String>는 리턴할 수 없다, User를 상속받은 객체만 리턴할 수 있다
		PersonalUser personalUser = new PersonalUser("kang", "1234", "강민", "aaa@bbb.com", "a20220001");
		CompanyUser companyUser = new CompanyUser("apple", "1111", "애플", "apple@aaa.com", "220-81-34432");
		
		if(username.equals(personalUser.getUsername())) {
			return new CMRespDto<PersonalUser>(1, "개인회원 프로필", personalUser);
		}else if(username.equals(companyUser.getUsername())) {
			return new CMRespDto<CompanyUser>(1, "기업회원 프로필", companyUser);
		}else {
//			return new CMRespDto<String>(-1, "프로필로드 실패", username); User를 상속받지 않았기 때문에 리턴할 수 없다
			return new CMRespDto<User>(-1, "프로필로드 실패", new User()); //비어있는 User객체 생성 후 리턴
		}
		
		
	}

	public CMRespDto<?> login(String username, String password){// ?는 와일드카드(타입에 따라서)
		User userEntity = User.builder().username("kang").password("1234").name("강민").email("kang@ggg.com").build();
		
		//User user = new User("kang", "1234", null, null); // null을 쓰기 싫어서 builder()를 쓴다
		
		if(userEntity.getUsername().equals(username)) {
			if(userEntity.getPassword().equals(password)) {
				return new CMRespDto<User>(1, "로그인 성공", userEntity);
			}else {
				return new CMRespDto<String>(-1, "비밀번호가 틀렸습니다", password);
			}
		}else {
			return new CMRespDto<String>(-1, "아이디가 틀렸습니다", username);
		}
	}
	
	public static void main(String[] args) {
		
		ControllerTest test = new ControllerTest();
		System.out.println(test.login("bbb", "1111"));
		System.out.println(test.getProfile("apple"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
