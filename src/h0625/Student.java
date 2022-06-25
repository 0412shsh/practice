package h0625;

public class Student {
	public String studentName; //������� �л��̸�
	public int grade; //������� �г�
	public int money; //������� ���� ��

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //�Ű������� BusŸ���� �������� ����, ����� main���� �ϱ� ������ ��ü ���� ���ص���
		bus.take(1000); //BusŬ������ take�޼���
		this.money -=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(3000);
		this.money -=4000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� "+money+"�� �Դϴ�.");
	}
}

