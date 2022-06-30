package h0630;

public class Company {
	private static Company instance = new Company(); //유일한 인스턴스
	private Company() {} //생성자
	
	
	public static Company getInstance() {
	 if (instance == null) {
		 instance = new Company();
	 }
		
		return instance; //의 값은 new Company();
	}
	
	
}
