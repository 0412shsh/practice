package h0625;

public class StudentTest {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이라라");
//		System.out.println(studentLee.serialNum); 평소방법 인스턴스.멤버변수 , 잘 안씀
		System.out.println(Student1.serialNum); //클래스명.멤버변수 static 사용 ,많이 씀
		System.out.println(studentLee.studentName + "의 학번은 " + Student1.serialNum+"입니다.");
	
	
		Student1 studentHo = new Student1();
		studentHo.setStudentName("손수수");
		System.out.println(studentHo.serialNum); //평소방법 인스턴스.멤버변수 , 잘 안씀
		// System.out.println(Student1.serialNum); 클래스명.멤버변수 static 사용 ,많이 씀
		System.out.println(studentHo.studentName + "의 학번은 " + Student1.serialNum+"입니다.");
	
	}
		
	  
	  
}
