package h0720;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() { //final ������ �Ұ��� 
		startCar(); //�Ϲݸ޼���
		drive();	//�߻�޼���
		wiper();
		stop();		//�߻�޼���
		turnOff();	//�Ϲݸ޼���
	} //���ø� �޼���, �̹� ���ǵ� �޼��� 4���� ������ run ���డ��, �̹� ���ǵ� �޼��� ȣ��  
}

