package h0628;

public class CoffeeMain {

	public static void main(String[] args) {
		Person kim = new Person("��");
		CoffeeShop star = new CoffeeShop("���ٹ�");
		kim.goCoffeeShop(star);
		kim.setMoney(4000);
		star.setMenu("�Ƹ޸�ī��");
		System.out.println(kim.showInfo());

	}

}
