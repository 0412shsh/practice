package h0802;

public class OtherClass {
	public void print(Parent parent) {
		//��ĳ���� parent = child1; 
		//��ĳ���� parent = child2; 
		parent.prn(); 
		//�ٿ�ĳ����
		Child1 child1 = (Child1)parent;
		Child2 child2 = (Child2)parent;
	}
}
