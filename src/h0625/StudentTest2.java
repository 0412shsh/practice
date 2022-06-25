package h0625;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이송송");
		System.out.println(Student2.getSerialNum()); //클래스이름.메서드
		System.out.println(studentLee.getStudentName()+"님의 학번은 "+studentLee.getSerialNum()+"입니다.");

		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수수");
		System.out.println(Student2.getSerialNum()); //클래스이름.메서드
		System.out.println(studentSon.getStudentName()+"님의 학번은 "+studentSon.getSerialNum()+"입니다.");
		
		
		
		
	}
	
		

}
