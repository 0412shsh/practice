package h0804;

class InterClass implements Inter{
 @Override
public void methodI() {
	 System.out.println("Interface �߻�޼��� ���� ��");	
 }
}

public class InterTest {
	public static void main(String[] args) {
		//�������̽� ���� ��� 3����
		//1. �츮�� �� ������ �ؿԴ� ��� ~~
		InterClass ic = new InterClass(); 
		ic.methodI();

	
		//2. �͸��� Ŭ������ ������
		Inter i1 = new Inter() {
			public void methodI() {
				System.out.println("�͸� Ŭ������ �߻�޼��� ���� ��");
			}
		};
		i1.methodI();
	}

}
