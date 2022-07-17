package h0717;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer gw = new VIPCustomer1(10030,"강우",2000);
		gw.bonusPoint=1000; 
		
		System.out.println(gw.getCustomerName() + "님이 지불해야 하는 금액은"
		+gw.calcPrice(10000)+"원입니다.");
	} // 멤변과 메서드는 선언한 클래스형에 따라 호출되는데, vip1의 재정의된 메서드 호출 
	// 상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할때 호출되는 메서드는 인스턴스에 따라 결정 ! 
	// 선언한 클래스형이 아닌 생성된 인스턴스(vip1)의 메서드 호출 

}
