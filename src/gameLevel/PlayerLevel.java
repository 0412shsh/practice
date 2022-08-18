package gameLevel;

public abstract class PlayerLevel {
	public abstract void run(); 
	public abstract void jump(); 
	public abstract void turn();
	public abstract void showLevelMessage(); //4���� �޼���� �� �������� ���ݾ� �ٸ��� ���� => �߻�޼��� 
	
	final public void go(int count) { //go�޼���� �ó�������� ����Ǿ���ϹǷ� �ڵ� ������ ������ ���� 
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
