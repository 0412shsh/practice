package h0717;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);	//customerID 와 customerName 은 protected 변수이므로, set메서드 호출
		customerLee.setCustomerName("우연");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer1 customerGo = new VIPCustomer1();
		customerGo.setCustomerID(10020);
		customerGo.setCustomerName("정원");
		customerGo.bonusPoint = 10000; 
		System.out.println(customerGo.showCustomerInfo());
	}

}
