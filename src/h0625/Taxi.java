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
		System.out.println("택시"+taxiNum+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
	}


}