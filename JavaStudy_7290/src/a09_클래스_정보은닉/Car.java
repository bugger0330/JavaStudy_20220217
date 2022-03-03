package a09_클래스_정보은닉;

public class Car {

//	public String model;
	private String model; // 이렇게 하면 CarTest에 . 찍은 곳에 빨간줄이 뜬다
	// 이떄 이 model을 쓰기 위해서는 통로가 필요하다
	
	public String getModel() { //통로
		return model; //리턴을 해줘야 한다 / 
	}
	public void setModel(String model) { // 매개변수가 우선순위가 높다. 그래서 c.setModel("k5") 이런식으로 쓴다
		this.model = model;
	}
	
}
