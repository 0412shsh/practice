package h0802;

public class Main {

	public static void main(String[] args) {
//		//Child1 객체생성
//		Child1 child1 = new Child1();
//		child1.prn();   //super.prn()때문에 부모클래스 갔다가 -> Child1클래스의 재정의한 prn 메서드 실행
//		System.out.println("===============");
//		child1.prn1(); //자식 Child1클래스의 prn1메서드 실행
//	
//		System.out.println();
//		System.out.println();
//		
//		
//		Child2 child2 = new Child2();
//		child2.prn();
//		System.out.println("===============");
//		child2.prn2();
//	
//		System.out.println();
//		System.out.println();
//		
//		
//		//업캐스팅 부모 = 자식
		Parent parent = new Child1(); 
//		//다형성
//		parent.prn();   // Parent 타입의 메서드를 사용하는데, 재정의한 메서드가 실행 ! 
	
		
//		//다운캐스팅 자식 = (자식형변환)부모
//		Child1 child1 = (Child1)parent;
//		child1.prn(); //자식클래스에서 재정의한 메서드 실행
//		System.out.println("============");
//		child1.prn1();
//		
//		System.out.println();
//		System.out.println();
		
		//OtherClass에서 Child1, Child2 전달
		//OtherClass 객체 생성
		OtherClass otherClass = new OtherClass(); 
		Child1 child1 = new Child1(); 
		otherClass.print(child1);
		
		Child2 child2=new Child2();
		otherClass.print(child2);
		
	}
	
	

}
