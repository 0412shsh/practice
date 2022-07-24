package h0724;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 상담원이 알아서 전화를 가져감");
		
		int ch = System.in.read(); //할당 방식을 입력받아 ch변수에 대입
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
//			RoundRobin scheduler = new RoundRobin(); 인터페이스 사용 X 
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
			System.out.println("지원하지 않는 기능입니다.");
			return; //없으면 아래 실행되고 오류 
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
		
	}

}
