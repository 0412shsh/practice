package h0724;

public interface Calc {
	double PI = 3.14; 
	int ERROR = -999999999; //인터페이스에서 선언하는 변수는 컴파일 과정에서 상수로 변함 (final 생략가능) 
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨 (abstract 생략가능) 
	
	int square(int num);
	
	
}
