package h0625;

class Person1{
	String name;
	int age;
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 	// �Ű����� �����ϴ� ������ 
	
	Person1(){
		this("����",5); 
}	//this�� ���� (String, int) ������ ȣ�� => ����Ʈ!! 
	
	/* Person1(){
	   this.name = "����";
	   this.age = 5;
	   }        => �⺻   */
	
	Person1 returnItSelf() {
		return this;
	} //�޼���, this�� ��ȯ, Person1 �ڽ��� �ּҰ��� ��ȯ~~! 
}

	public class CallAnotherConst {

	public static void main(String[] args) {
		Person1 cha = new Person1();
		System.out.println(cha.name);
		System.out.println(cha.age+"��");
		
		Person1 p = cha.returnItSelf();
//		Person1 p = new Person1(); �ص� ��������� cha�� ���� ���� ��ü ���� 
//		Person1 p = cha; cha��ü�� �̹� Person1Ÿ��, Person1 cha = new Person1; ��� ������ 
		
		System.out.println(p);  //cha.returnItSelf()�� ��ȯ �� ��� , �ּҰ� 
		System.out.println(cha);//�������� �ּҰ� ���! 

	}

}
