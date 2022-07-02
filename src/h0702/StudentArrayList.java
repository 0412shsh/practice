package h0702;

import java.util.ArrayList;

public class StudentArrayList {


		int studentId;
		String studentName;
		ArrayList <Subject> subjectList; //ArrayList�����ϱ� 
		
		public StudentArrayList(int studentId, String studentName) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			subjectList = new ArrayList<Subject>(); //subjectList�� ���� new ArrayList<>();
			
		}
		
		public void addSubject(String name, int score) {
			Subject subject = new Subject();
			subject.setName(name);
			subject.setScorePoint(score);
			subjectList.add(subject); //�迭������ ���� ���� �ִ´� 
			
		}
		
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : subjectList) {
				total += s.getScorePoint();
				System.out.println("�л�"+studentName+"��"
						+s.getName()+"���� ������ "+s.getScorePoint()+"�Դϴ�.");
			}
			System.out.println("�л�"+studentName+"�� ������"+total +"�Դϴ�.");
		}
		
		
		
	
}
