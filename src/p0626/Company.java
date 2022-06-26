package p0626;

public class Company {
	private static Company instance = new Company(); // 클래스 내부에 static으로 유일한 인스턴스 생성
	private Company() {} //private 생성자
	
	public static Company getInstance() { //외부클래스에서는 Company를 형성할 수 없으므로, static으로 제공하는 getInstance() 메서드 호출 
		if(instance == null) {
			instance = new Company();
		}
		return instance;  //유일하게 생성한 인스턴스 반환 , 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
	
	}
}
