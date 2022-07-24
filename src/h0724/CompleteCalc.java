package h0724;

public class CompleteCalc extends Calculator{
	//@Override
	public int times(int num1, int num2) {
		return num1+num2;
	}
	
	//@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) //num2가 0이 아닐때
			return num1/num2; //실행
		else 
			return Calc.ERROR; //0일 경우 에러 반환 
		}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다. ");
	}
	
//	/@Override
	public int square(int num1) {
		return num1*num1;
	}
	
}
