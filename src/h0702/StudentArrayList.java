package h0702;

import java.util.ArrayList;

public class StudentArrayList {


		int studentId;
		String studentName;
		ArrayList <Subject> subjectList; //ArrayList선언하기 
		
		public StudentArrayList(int studentId, String studentName) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			subjectList = new ArrayList<Subject>(); //subjectList의 값은 new ArrayList<>();
			
		}
		
		public void addSubject(String name, int score) {
			Subject subject = new Subject();
			subject.setName(name);
			subject.setScorePoint(score);
			subjectList.add(subject); //배열변수에 값을 집어 넣는다 
			
		}
		
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : subjectList) {
				total += s.getScorePoint();
				System.out.println("학생"+studentName+"의"
						+s.getName()+"과목 성적은 "+s.getScorePoint()+"입니다.");
			}
			System.out.println("학생"+studentName+"의 총점은"+total +"입니다.");
		}
		
		
		
	
}
