package h0802;

public class Child2 extends Parent {
	public void prn2() {
		System.out.println("�ڽ�Ŭ����2");
	}
	
	@Override
	public void prn() {
		super.prn();
		System.out.println("�θ�޼��� ������2");
	}
}
