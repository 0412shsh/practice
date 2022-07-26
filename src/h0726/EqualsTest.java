package h0726;

class Student{
	int studentId; //�⺯,�й�
	String studentName; //�⺯,�̸�
	
public Student(int studentId, String studentName) {
	this.studentId = studentId;
	this.studentName = studentName;
	}
@Override
public String toString() {
	return studentId + " , " + studentName;
 }
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100,"������");
		Student studentLee2 = studentLee; // �ּҺ���
		Student studentPong = new Student(100,"������"); 
		
		System.out.println(studentLee.toString());
		
		if(studentLee == studentLee2) // == ��ȣ�� ��
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�. ");
		else 
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�. ");
		
		if(studentLee.equals(studentLee2))//equals() �޼���� �� 
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
	
		if(studentLee == studentPong)
			System.out.println("studentLee�� studenPong�� �ּҴ� �����ϴ�.");
		else 
			System.out.println("studentLee�� studentPong�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentPong))
			System.out.println("studentLee�� studentPong�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentPong�� �������� �ʽ��ϴ�.");
	
	
	}	
			

}
