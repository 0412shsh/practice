package h0724;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass; // ���� �������̽� X������ �����ϸ� X�� ������ �޼��常 ȣ�� ����
		xClass.x();
		
		Y yClass = mClass;
		yClass.Y(); //���� �������̽� Y������ �����ϸ� Y�� ������ �޼��常 ȣ�� ���� 
		
		MyInterface iClass = mClass; //������ �������̽��� ������ �����ϸ� �������̽��� ����� ��� �޼��� ȣ�� ����  
		iClass.myMethod();
		iClass.x();
		iClass.Y();
	}

}