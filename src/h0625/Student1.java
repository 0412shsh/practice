package h0625;

public class Student1 {
	public static int serialNum = 1000; //static �������
	public int studentID;
	public String studentName;
	public int grade;
	public int address;
	
	public Student1() {
		serialNum++;
		studentID=serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	


}
