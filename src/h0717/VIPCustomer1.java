package h0717;

public class VIPCustomer1 extends Customer {
	private int agentID;//VIP�� ���� ���̵�
	double saleRatio; // ������
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price -(int)(price*saleRatio);
	}
	public VIPCustomer1(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		System.out.println("VIPCustomer(int,String)������ ȣ��");
		
	}
	public VIPCustomer1() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
		}
	
	public int getAgentID() {
		return agentID;
	}
	
	
}

