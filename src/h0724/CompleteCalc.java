package h0724;

public class CompleteCalc extends Calculator{
	//@Override
	public int times(int num1, int num2) {
		return num1+num2;
	}
	
	//@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) //num2�� 0�� �ƴҶ�
			return num1/num2; //����
		else 
			return Calc.ERROR; //0�� ��� ���� ��ȯ 
		}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�. ");
	}
	
//	/@Override
	public int square(int num1) {
		return num1*num1;
	}
	
}
