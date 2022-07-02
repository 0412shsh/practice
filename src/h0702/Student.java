package h0702;

public class Student {
	public int studentID;
	String studentName; 
	
	void showStudentInfo() {
		System.out.println(studentID+","+studentName); //메서드
	}

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	} //생성자 
	
	
}
