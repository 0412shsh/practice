package h0724;

public class MyClass implements MyInterface{
	@Override
		public void x() {
			System.out.println("x()");	//X�������̽����� ��ӹ��� x() �޼��� ����
	}
	
	@Override
	public void Y() {
		System.out.println("y()");	//Y�������̽����� ��ӹ��� y() �޼��� ����
	}
	
	@Override
	public void myMethod() {
		System.out.println("myMethod()");	//MyInterface�������̽��� myMethod()���� 
	}
}
