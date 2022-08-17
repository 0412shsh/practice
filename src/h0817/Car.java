package h0817;

public abstract class Car {
	public abstract void drive(); 
	public abstract void stop(); //2개의 추상메서드 
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다."); 
	}

	final public void run() {
		startCar();
		drive();
		stop();
		turnOff(); 
	} //템플릿 메서드 
	

}


