package h0802;

public class Child1 extends Parent {
//�ڽ�Ŭ����
	public void prn1() {
		System.out.println("�ڽ�Ŭ����1");
	}
	//�޼��� �������̵� : �θ��� �޼��� ������
	//alt shift s -> v 
	@Override
		public void prn() {
			super.prn();
			System.out.println("�θ�޼��� ������1");
	}
}
