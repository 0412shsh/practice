package h0724;

public class PrioirtyAllocation implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");	
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����´�.");	
	}
}
