package h0724;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
	
		System.out.println(calc.square(3));
		
//		Calc newCalc = calc;
//		newCalc -> 묵시적 형변환이 일어날때 사용할 수 있는 메서드는 인터페이스에서 선언한 메서드 !!! 
		
	} //Calculator 클래스는 추상 클래스이므로, 인스턴스를 생성할수 없음 
	  //Calc 인터페이스는 추상 메서드만 선언되었기 때문에 인스턴스를 생성할 수 없음 
	

}
