package h0625;

class Person1{
	String name;
	int age;
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 	// 매개변수 존재하는 생성자 
	
	Person1(){
		this("차차",5); 
}	//this를 통해 (String, int) 생성자 호출 => 베스트!! 
	
	/* Person1(){
	   this.name = "차차";
	   this.age = 5;
	   }        => 기본   */
	
	Person1 returnItSelf() {
		return this;
	} //메서드, this를 반환, Person1 자신의 주소값을 반환~~! 
}

	public class CallAnotherConst {

	public static void main(String[] args) {
		Person1 cha = new Person1();
		System.out.println(cha.name);
		System.out.println(cha.age+"세");
		
		Person1 p = cha.returnItSelf();
//		Person1 p = new Person1(); 해도 상관없지만 cha와 관련 없는 객체 생성 
//		Person1 p = cha; cha자체가 이미 Person1타입, Person1 cha = new Person1; 라고 생성함 
		
		System.out.println(p);  //cha.returnItSelf()의 반환 값 출력 , 주소값 
		System.out.println(cha);//참조변수 주소값 출력! 

	}

}
