package h0625;

public class ATest {

	public static void main(String[] args) {
		A a; 
		a = new A(); //A a = new A(); 객체생성
		
		int b = a.member;
		a.methodA(300);
		// methodA의 호출 
		/*   void methodA(int x){
		       System.out.println(x);
		           return;          */

		// a = a.member(300); => 사용 불가능 
		
		
		b = a.methodB(500);
		/*
		 int methodB(int x) {
		return x;     => 설계도 따라서!!!!! 
	} 
		 */
		
		
	}

}
