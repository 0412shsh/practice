package h0724;

public class PrioirtyAllocation implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");	
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져온다.");	
	}
}
