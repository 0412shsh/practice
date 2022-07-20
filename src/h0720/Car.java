package h0720;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { //final 재정의 불가능 
		startCar(); //일반메서드
		drive();	//추상메서드
		wiper();
		stop();		//추상메서드
		turnOff();	//일반메서드
	} //템플릿 메서드, 이미 정의된 메서드 4개를 가져야 run 실행가능, 이미 정의된 메서드 호출  
}

