package h0628;

public class CarFactory {
	private static CarFactory instance = new CarFactory(); //유일한 인스턴스 생성
	
	private CarFactory() {} //생성자 
	
	public static CarFactory getInstance() { //다른 클래스에서 호출하기 위해 생성한 get 메서드
		return instance;
	}
	
	Car createCar() {
		return new Car();
	}

}
