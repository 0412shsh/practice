package h0625;

public class CaculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); // Calculator ��ü ����
		
		System.out.println(c1.add(200, 50)); // 250, �޼��� ȣ�� ��� 
		System.out.println(c1.sub(200, 50)); // 150
		System.out.println(c1.mul(200, 50)); // 10000
		System.out.println(c1.div(200, 50)); // 4

	}

}
