package h0818;

public class CompleteCalc extends Calculator{
	//@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}
	
	//@Override
	public int divide(int num1, int num2) {
		if(num1/num2 !=0 )
		return num1/num2;
		else 
			return Calc.ERROR;
	}//num2�� 0 , �� ������ ���� 0�� ��쿡 ���� ���� ��ȯ

	@Override
	public int square(int num1) {
		return num1*num1;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

	@Override
	public void description() {
		System.out.println("���� ������ description()�̴�!!");
	}

}
