package h0625;

public class ATest {

	public static void main(String[] args) {
		A a; 
		a = new A(); //A a = new A(); ��ü����
		
		int b = a.member;
		a.methodA(300);
		// methodA�� ȣ�� 
		/*   void methodA(int x){
		       System.out.println(x);
		           return;          */

		// a = a.member(300); => ��� �Ұ��� 
		
		
		b = a.methodB(500);
		/*
		 int methodB(int x) {
		return x;     => ���赵 ����!!!!! 
	} 
		 */
		
		
	}

}
