package h0720;

public class AICar extends Car {
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�.");
	}
	
	public void stop() {
		System.out.println("������ ����ϴ�.");
		
	}
	
	@Override
	public void wiper() {
		System.out.println("�� ���� �翡 ���� �ٸ��Ⱑ �ڵ����� �����˴ϴ�.");	
	}
}
