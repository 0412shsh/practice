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
//		newCalc -> ������ ����ȯ�� �Ͼ�� ����� �� �ִ� �޼���� �������̽����� ������ �޼��� !!! 
		
	} //Calculator Ŭ������ �߻� Ŭ�����̹Ƿ�, �ν��Ͻ��� �����Ҽ� ���� 
	  //Calc �������̽��� �߻� �޼��常 ����Ǿ��� ������ �ν��Ͻ��� ������ �� ���� 
	

}