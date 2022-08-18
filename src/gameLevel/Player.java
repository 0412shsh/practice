package gameLevel;

public class Player {
	private PlayerLevel level; //Player�� ������ level ���� ���� 
	
	public Player() {
		level = new BeginnerLevel(); //PlayerLevel��������, ����޸𸮷� ���� �����ǵ� �޼����� ������ ����� ���̴�! 
		level.showLevelMessage();
	} //����Ʈ ������, ó�� �����Ǹ� Beginner������ �����ϸ�, ���� �޽��� ��� 

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void uppgradeLevel (PlayerLevel level) { //�Ű����� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
		this.level = level;	//���� ���� �޼��� , ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޼��� ��� 
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	} //PlayerLevel�� ���ø� �޼��� go()ȣ�� 

}
