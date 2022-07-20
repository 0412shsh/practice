package h0720;

public class Player {
	private PlayerLevel level; //Play가 가지는 level 변수 선언
	
	public Player() {
		level = new BeginnerLevel(); //디폴트 생성자, 처음 생성되면 BeginnerLevel로 시작, 레벨메세지 출력
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	} //레벨 변경 메서드, 현재 자신의 level을 매개변수로 받은 level로 변경하고 레벨 메세지 출력 
	
	public void play(int count) {
		level.go(count);
	} //PalyerLevel의 템플릿 메서드 go()호출
}
