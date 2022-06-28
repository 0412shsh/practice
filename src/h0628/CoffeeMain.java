package h0628;

public class CoffeeMain {

	public static void main(String[] args) {
		Person kim = new Person("김");
		CoffeeShop star = new CoffeeShop("별다방");
		kim.goCoffeeShop(star);
		kim.setMoney(4000);
		star.setMenu("아메리카노");
		System.out.println(kim.showInfo());

	}

}
