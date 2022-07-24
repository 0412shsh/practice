package h0724;

public class Constant {
	int num = 100;
	final int NUM = 100; //상수선언 
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50; 
//		cons.NUM = 200; //상수에 값을 대입하여 오류 발생 , 다른값 대입 불가능
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
