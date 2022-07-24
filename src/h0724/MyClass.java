package h0724;

public class MyClass implements MyInterface{
	@Override
		public void x() {
			System.out.println("x()");	//X인터페이스에서 상속받은 x() 메서드 구현
	}
	
	@Override
	public void Y() {
		System.out.println("y()");	//Y인터페이스에서 상속받은 y() 메서드 구현
	}
	
	@Override
	public void myMethod() {
		System.out.println("myMethod()");	//MyInterface인터페이스의 myMethod()구현 
	}
}
