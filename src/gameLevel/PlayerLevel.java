package gameLevel;

public abstract class PlayerLevel {
	public abstract void run(); 
	public abstract void jump(); 
	public abstract void turn();
	public abstract void showLevelMessage(); //4개의 메서드는 각 레벨마다 조금씩 다르게 구현 => 추상메서드 
	
	final public void go(int count) { //go메서드는 시나리오대로 수행되어야하므로 코드 내용을 완전히 구현 
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
