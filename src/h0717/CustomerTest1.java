package h0717;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);	//customerID �� customerName �� protected �����̹Ƿ�, set�޼��� ȣ��
		customerLee.setCustomerName("�쿬");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer1 customerGo = new VIPCustomer1();
		customerGo.setCustomerID(10020);
		customerGo.setCustomerName("����");
		customerGo.bonusPoint = 10000; 
		System.out.println(customerGo.showCustomerInfo());
	}

}
