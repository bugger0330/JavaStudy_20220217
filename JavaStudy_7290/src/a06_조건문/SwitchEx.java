package a06_조건문;

public class SwitchEx {

	public static void main(String[] args) {
		
		//case는 해당 번호부터 밑으로 전부 다 실행
		//switch + case + break 로 되어있다
		//else == default
		//default가 밑에 있을떈 break가 필요없지만
		//default가 위에 있을땐 break가 필요하다, 하지만 해깔리니 맨 밑에 쓸것
		
		int select = 1;
		
		switch(select) {
		case 1 : 
			System.out.println("1을 선택하셨습니다");
			break;
		case 2 : 
			System.out.println("2을 선택하셨습니다");
			break;
		case 3 : 
			System.out.println("3을 선택하셨습니다");
			break;
		default :
			System.out.println("해당 case는 없습니다");
		}
		
		String select2 = "강민2";
		switch(select2) {
		case "강민" :
			System.out.println("선택하신 이름은 강민 입니다");
			break;
		case "강민2" :
			System.out.println("선택하신 이름은 강민2 입니다");
			break;
		case "강민3" :
			System.out.println("선택하신 이름은 강민3 입니다");
			break;
		}
		
		int num = 2;
		if(num == 0) {
			System.out.println("0입니다");
		}else {
			switch(num % 2) {
			case 1 :
				System.out.println("홀수 입니다");
				break;
			default :
				System.out.println("짝수 입니다");
			}
		}
		
		switch(num == 0 ? 2 : num % 2) {
		case 1 :
			System.out.println("홀수 입니다"); break;
		case 0 :
			System.out.println("짝수 입니다");break;
		case 2 :
			System.out.println("0 입니다");break;
		}
		
	}
}
