package h0625;

public class Taxi {
	String taxiNum;
	int passengerCount;
	int money;
	
	public Taxi(String taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money){
		this.money+=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("�ý�"+taxiNum+"���� �°��� "+passengerCount+"���̰�, ������ "+money+"���Դϴ�.");
	}


}