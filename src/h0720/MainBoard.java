
package h0720;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); //ó�� �����ϴ� beginnerLevel
		player.play(1);
	
	AdvancedLevel aLevel = new AdvancedLevel();
	player.upgradeLevel(aLevel);
	player.play(2);
	
	SuperLevel sLevel = new SuperLevel();
	player.upgradeLevel(sLevel);
	player.play(3);
	
	}
}
