package h0625;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("�̼ۼ�");
		System.out.println(Student2.getSerialNum()); //Ŭ�����̸�.�޼���
		System.out.println(studentLee.getStudentName()+"���� �й��� "+studentLee.getSerialNum()+"�Դϴ�.");

		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2.getSerialNum()); //Ŭ�����̸�.�޼���
		System.out.println(studentSon.getStudentName()+"���� �й��� "+studentSon.getSerialNum()+"�Դϴ�.");
		
		
		
		
	}
	
		

}
