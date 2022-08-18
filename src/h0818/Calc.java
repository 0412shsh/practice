package h0818;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999999; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변함 
	
	
	int add(int num1,int num2);
	int substract(int num1, int num2); 
	int times(int num1,int num2); 
	int divide(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변함 
	int square(int num1); 
	
	default void description () {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //디폴트메서드에서 private 메서드 호출 
	} //디폴트메서드 
	
	static int total(int[]arr) {
		int total = 0; 
		
		for(int i : arr) {
			total+=i;
		}
		myStaticMethod();
		return total;
	} //인터페이스에 정적 메서드 total()구현
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private stastic 메서드입니다.");
	}
}
