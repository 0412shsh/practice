package h0726;

class Student{
	int studentId; //멤변,학번
	String studentName; //멤변,이름

	@Override
	public int hashCode() {
		return studentId;
	} //해시 코드 값으로 학번을 반환하도록 메서드 재정의
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) //재정의한 equals() 메서드는 학생의 학번이 같으면 true반환 
				return true;
			else return false;
		}
		return false;
	}
	
	
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
	
	
		
		System.out.println("studentLee의 hashCode : "+ studentLee.hashCode());
		System.out.println("studentPong의 hasgCode : "+ studentPong.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : "+System.identityHashCode(studentLee));
		System.out.println("studentPong의 실제 주소값 : "+System.identityHashCode(studentPong));
		
		//StudentLee와 StudentPong은 논리적으로는 같지만, 실제론 다른 인스턴스 , 실제 주소값이 다름 
		
	}	
			

}
