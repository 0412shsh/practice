package h0726;

class Student{
	int studentId; //멤변,학번
	String studentName; //멤변,이름
	
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
		Student studentLee = new Student(100,"이퐁퐁");
		Student studentLee2 = studentLee; // 주소복사
		Student studentPong = new Student(100,"이퐁퐁"); 
		
		System.out.println(studentLee.toString());
		
		if(studentLee == studentLee2) // == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다. ");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다. ");
		
		if(studentLee.equals(studentLee2))//equals() 메서드로 비교 
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
	
		if(studentLee == studentPong)
			System.out.println("studentLee와 studenPong의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentPong의 주소는 다릅니다.");
		
		if(studentLee.equals(studentPong))
			System.out.println("studentLee와 studentPong은 동일합니다.");
		else
			System.out.println("studentLee와 studentPong은 동일하지 않습니다.");
	
	
	}	
			

}
