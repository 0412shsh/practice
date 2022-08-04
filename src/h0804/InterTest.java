package h0804;

class InterClass implements Inter{
 @Override
public void methodI() {
	 System.out.println("Interface 추상메서드 구현 완");	
 }
}

public class InterTest {
	public static void main(String[] args) {
		//인터페이스 구현 방법 3가지
		//1. 우리가 이 때까지 해왔던 방식 ~~
		InterClass ic = new InterClass(); 
		ic.methodI();

	
		//2. 익명의 클래스로 만들어보기
		Inter i1 = new Inter() {
			public void methodI() {
				System.out.println("익명 클래스로 추상메서드 구현 완");
			}
		};
		i1.methodI();
	}

}
