package h0628;

public class Person {
	
	String name;
	CoffeeShop cs;
	int money; 
	
	
	Person(String name){
		this.name=name;
	}


	void goCoffeeShop(CoffeeShop cs) {
		this.cs=cs;
	}

	
	String showInfo() {
		return name +"���� "+cs+"����"+money+"���� ����ϴ�.";
	}
	
	
	public void setMoney(int money) {
		this.money = money;
	}
	
}
