package a11_상속2;

public class ElectronicsCompany extends Company {

	public ElectronicsCompany(String companyName) {
		// TODO Auto-generated constructor stub
		super(companyName + "전자");
	}

	public void addFactory() {
		System.out.println(super.getCompanyName() + " 공장을 추가합니다");
	}
	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		super.setCompanyName(companyName + "전자");
	}
}
