package h0625;

public class StudentTest {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("�̶��");
//		System.out.println(studentLee.serialNum); ��ҹ�� �ν��Ͻ�.������� , �� �Ⱦ�
		System.out.println(Student1.serialNum); //Ŭ������.������� static ��� ,���� ��
		System.out.println(studentLee.studentName + "�� �й��� " + Student1.serialNum+"�Դϴ�.");
	
	
		Student1 studentHo = new Student1();
		studentHo.setStudentName("�ռ���");
		System.out.println(studentHo.serialNum); //��ҹ�� �ν��Ͻ�.������� , �� �Ⱦ�
		// System.out.println(Student1.serialNum); Ŭ������.������� static ��� ,���� ��
		System.out.println(studentHo.studentName + "�� �й��� " + Student1.serialNum+"�Դϴ�.");
	
	}
		
	  
	  
}
