package h0802;

public class Main {

	public static void main(String[] args) {
//		//Child1 ��ü����
//		Child1 child1 = new Child1();
//		child1.prn();   //super.prn()������ �θ�Ŭ���� ���ٰ� -> Child1Ŭ������ �������� prn �޼��� ����
//		System.out.println("===============");
//		child1.prn1(); //�ڽ� Child1Ŭ������ prn1�޼��� ����
//	
//		System.out.println();
//		System.out.println();
//		
//		
//		Child2 child2 = new Child2();
//		child2.prn();
//		System.out.println("===============");
//		child2.prn2();
//	
//		System.out.println();
//		System.out.println();
//		
//		
//		//��ĳ���� �θ� = �ڽ�
		Parent parent = new Child1(); 
//		//������
//		parent.prn();   // Parent Ÿ���� �޼��带 ����ϴµ�, �������� �޼��尡 ���� ! 
	
		
//		//�ٿ�ĳ���� �ڽ� = (�ڽ�����ȯ)�θ�
//		Child1 child1 = (Child1)parent;
//		child1.prn(); //�ڽ�Ŭ�������� �������� �޼��� ����
//		System.out.println("============");
//		child1.prn1();
//		
//		System.out.println();
//		System.out.println();
		
		//OtherClass���� Child1, Child2 ����
		//OtherClass ��ü ����
		OtherClass otherClass = new OtherClass(); 
		Child1 child1 = new Child1(); 
		otherClass.print(child1);
		
		Child2 child2=new Child2();
		otherClass.print(child2);
		
	}
	
	

}
