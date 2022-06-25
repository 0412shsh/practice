package h0625;

public class A {
	A(){
		System.out.println("나는 생성자");
	}
	
	int member;
	
	void methodA(int x){
		System.out.println(x);
		return;
	}	//반환값이 없는 메서드, 화면에 출력하고 끝, return 문 끝으로 끝!! 

	int methodB(int x) {
		return x;
	}	//int로 리턴
	
	


}
