package h0702;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList <Student> studentArrayList = new ArrayList<>(); 
		studentArrayList.add(new Student(1001,"Rome"));
		studentArrayList.add(new Student(1002,"Mond"));
		studentArrayList.add(new Student(1003,"Mon"));
	
		for(Student s : studentArrayList) {
			//System.out.println(s); studentArrayList�� Student�� �������������̹Ƿ�, �ּҰ��� ��� 
			s.showStudentInfo(); //�޼�����
		}
	
	}

}
