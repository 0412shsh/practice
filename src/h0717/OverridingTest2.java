package h0717;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer gw = new VIPCustomer1(10030,"����",2000);
		gw.bonusPoint=1000; 
		
		System.out.println(gw.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ���"
		+gw.calcPrice(10000)+"���Դϴ�.");
	} // �⺯�� �޼���� ������ Ŭ�������� ���� ȣ��Ǵµ�, vip1�� �����ǵ� �޼��� ȣ�� 
	// ��ӿ��� ���� Ŭ������ ���� Ŭ������ ���� �̸��� �޼��尡 �����Ҷ� ȣ��Ǵ� �޼���� �ν��Ͻ��� ���� ���� ! 
	// ������ Ŭ�������� �ƴ� ������ �ν��Ͻ�(vip1)�� �޼��� ȣ�� 

}
