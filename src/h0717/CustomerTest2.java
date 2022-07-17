package h0717;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "우연");
		customerLee.bonusPoint=1000;
		
		VIPCustomer1 customerGo = new VIPCustomer1(10020, "정원",12344);
		customerGo.bonusPoint=10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName()+"님이 지불해야할 금액은 "+ 
		customerLee.calcPrice(price)+"원입니다.");
		
		System.out.println(customerGo.getCustomerName()+"님이 지불해야할 금액은 "+
		customerGo.calcPrice(price)+"원입니다.");
	}

}
