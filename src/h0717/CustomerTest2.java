package h0717;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�쿬");
		customerLee.bonusPoint=1000;
		
		VIPCustomer1 customerGo = new VIPCustomer1(10020, "����",12344);
		customerGo.bonusPoint=10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName()+"���� �����ؾ��� �ݾ��� "+ 
		customerLee.calcPrice(price)+"���Դϴ�.");
		
		System.out.println(customerGo.getCustomerName()+"���� �����ؾ��� �ݾ��� "+
		customerGo.calcPrice(price)+"���Դϴ�.");
	}

}
