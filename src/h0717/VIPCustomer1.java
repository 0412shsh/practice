package h0717;

public class VIPCustomer1 extends Customer {
	private int agendtID;//VIP고객 상담원 아이디
	double saleRatio; // 할인율
	
	public VIPCustomer1() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		}
	public int getAgentID() {
		return agendtID;
	}
	
	
}

