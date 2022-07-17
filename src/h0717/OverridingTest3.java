package h0717;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "우연");
		System.out.println(customerLee.getCustomerName()+"님이 지불해야할 금액은 "+ 
		customerLee.calcPrice(price)+"원입니다.");
		
		VIPCustomer1 customerGo = new VIPCustomer1(10020, "정원", 12345);
		System.out.println(customerGo.getCustomerName()+"님이 지불해야할 금액은 "+ 
		customerGo.calcPrice(price)+"원입니다.");
		
		Customer customerSeo = new VIPCustomer1(10030,"강우", 12350);
		System.out.println(customerSeo.getCustomerName()+"님이 지불해야할 금액은 "+
		customerSeo.calcPrice(price)+"원입니다.");
	}

}
