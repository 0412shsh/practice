package h0717;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "�쿬");
		System.out.println(customerLee.getCustomerName()+"���� �����ؾ��� �ݾ��� "+ 
		customerLee.calcPrice(price)+"���Դϴ�.");
		
		VIPCustomer1 customerGo = new VIPCustomer1(10020, "����", 12345);
		System.out.println(customerGo.getCustomerName()+"���� �����ؾ��� �ݾ��� "+ 
		customerGo.calcPrice(price)+"���Դϴ�.");
		
		Customer customerSeo = new VIPCustomer1(10030,"����", 12350);
		System.out.println(customerSeo.getCustomerName()+"���� �����ؾ��� �ݾ��� "+
		customerSeo.calcPrice(price)+"���Դϴ�.");
	}

}
