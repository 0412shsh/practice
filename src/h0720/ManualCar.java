package h0720;

public class ManualCar extends Car{
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
	}
	
	@Override
	public void wiper() {
		System.out.println("����� �����⸦ �����մϴ�.");	
	}
}
