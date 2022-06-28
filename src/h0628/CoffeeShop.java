package h0628;

public class CoffeeShop {
	String menu;
	String name;
	
	
	CoffeeShop(String name){
		this.name = name;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	String showInfo() {
		return name;
	}

}
