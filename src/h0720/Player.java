package h0720;

public class Player {
	private PlayerLevel level; //Play�� ������ level ���� ����
	
	public Player() {
		level = new BeginnerLevel(); //����Ʈ ������, ó�� �����Ǹ� BeginnerLevel�� ����, �����޼��� ���
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	} //���� ���� �޼���, ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޼��� ��� 
	
	public void play(int count) {
		level.go(count);
	} //PalyerLevel�� ���ø� �޼��� go()ȣ��
}
