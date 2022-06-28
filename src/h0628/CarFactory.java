package h0628;

public class CarFactory {
	private static CarFactory instance = new CarFactory(); //������ �ν��Ͻ� ����
	
	private CarFactory() {} //������ 
	
	public static CarFactory getInstance() { //�ٸ� Ŭ�������� ȣ���ϱ� ���� ������ get �޼���
		return instance;
	}
	
	Car createCar() {
		return new Car();
	}

}
