package h0724;

public class RoundRobin implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����´�. ");	
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����Ѵ�. ");	
	}
}