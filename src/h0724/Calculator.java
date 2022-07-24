package h0724;

public abstract class Calculator implements Calc { //추상 클래스
	// Add unimplemented methods 추상 메서드를 구현하세요
	// Make type Calculator abstract Calculator 클래스를 추상 클래스로 만든세요 
		
	//@Override
	public int add(int num1, int num2) {
	 return num1+num2;	
	}

	//@Override
	public int substract(int num1, int num2) {
	 return num1-num2;	
	}

	// times와 divide를 구현하지 않아 Calculator는 추상클래스입니다. 
	
	
}
