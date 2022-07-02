package h0702;

public class StudentTest {

	public static void main(String[] args) {
		StudentArrayList studentRome = new StudentArrayList(1001,"Rome"); //객체생성 
		studentRome.addSubject("국어", 100);
		studentRome.addSubject("수학", 90);
		
		StudentArrayList studentMond = new StudentArrayList(1002,"Mond"); //객체생성
		studentMond.addSubject("국어", 70);
		studentMond.addSubject("영어", 100);
		studentMond.addSubject("수학",80);
		
		studentRome.showStudentInfo();
		System.out.println("========================");
		studentMond.showStudentInfo();
		
	}

}
