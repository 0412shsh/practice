package h0625;

public class Bus {
	int busNumber;		//������ȣ
	int passengerCount; // �°� ��
	int money;			//���� ����
	
	
	public Bus(int busNumber) {			//���� ��ȣ�� �Ű������� �޴� ������
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;			//���� ���� ����
		passengerCount++;				//�°� �� ���� 
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°���" + passengerCount + 
				"���̰�, ������ "+ money + "�Դϴ�.");
	}
}
