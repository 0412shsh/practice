package h0702;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList <Student> studentArrayList = new ArrayList<>(); 
		studentArrayList.add(new Student(1001,"Rome"));
		studentArrayList.add(new Student(1002,"Mond"));
		studentArrayList.add(new Student(1003,"Mon"));
	
		for(Student s : studentArrayList) {
			//System.out.println(s); studentArrayList는 Student가 참조데이터형이므로, 주소값이 뜬다 
			s.showStudentInfo(); //메서드사용
		}
	
	}

}
