package h0702;

public class StudentTest {

	public static void main(String[] args) {
		StudentArrayList studentRome = new StudentArrayList(1001,"Rome"); //��ü���� 
		studentRome.addSubject("����", 100);
		studentRome.addSubject("����", 90);
		
		StudentArrayList studentMond = new StudentArrayList(1002,"Mond"); //��ü����
		studentMond.addSubject("����", 70);
		studentMond.addSubject("����", 100);
		studentMond.addSubject("����",80);
		
		studentRome.showStudentInfo();
		System.out.println("========================");
		studentMond.showStudentInfo();
		
	}

}
