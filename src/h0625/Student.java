package h0625;

public class Student {
	public String studentName; //멤버변수 학생이름
	public int grade; //멤버변수 학년
	public int money; //멤버변수 가진 돈

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //매개변수로 Bus타입이 들어오도록 설계, 사용은 main에서 하기 때문에 객체 생성 안해도됨
		bus.take(1000); //Bus클래스의 take메서드
		this.money -=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(3000);
		this.money -=4000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 "+money+"원 입니다.");
	}
}

