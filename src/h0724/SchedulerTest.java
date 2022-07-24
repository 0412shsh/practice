package h0724;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʴ�� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		System.out.println("A : ������ �˾Ƽ� ��ȭ�� ������");
		
		int ch = System.in.read(); //�Ҵ� ����� �Է¹޾� ch������ ����
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
//			RoundRobin scheduler = new RoundRobin(); �������̽� ��� X 
//			scheduler.getNextCall();
//			scheduler.sendCallToAgent();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob(); 
//			LeastJob scheduler2 = new LeastJob();
//			scheduler2.getNextCall();
//			scheduler2.sendCallToAgent();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PrioirtyAllocation();
//			PrioirtyAllocation scheduler3 = new PrioirtyAllocation();
//			scheduler3.getNextCall();
//			scheduler3.sendCallToAgent();
		}
		else if (ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();

		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return; //������ �Ʒ� ����ǰ� ���� 
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
		
	}

}
