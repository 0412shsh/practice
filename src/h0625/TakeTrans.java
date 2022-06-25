package h0625;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentRaymond = new Student("Raymond",10000);
		Bus bus111 = new Bus(111); // 111번 버스 생성
		studentRaymond.takeBus(bus111); //가진돈 -1000원, 111번 버스 수입 +1000원, 승객수 +1 
		studentRaymond.showInfo();
		bus111.showInfo();
	
	
		
		Student studentJerome = new Student("Jerome", 50000);
		Subway red = new Subway("1호선"); //1호선 지하철 생성
		studentJerome.takeSubway(red); //가진돈 -1500, 1호선 수입 +1500, 승객수 +1 
		studentJerome.showInfo();
		red.showInfo();
		
		
		
		Student studentSimmon = new Student("Simmon", 100000);
		Taxi taxi = new Taxi("가1234"); //가1234 택시 생성
		studentSimmon.takeTaxi(taxi); //taxi타입형 변수, 가진돈 -4000, 가1234 수입 +4000, 승객수 +1
		studentSimmon.showInfo();
		taxi.showInfo();
		
		
		Student studentHa = new Student("Ha", 1000000);
		studentHa.takeTaxi(taxi);  //객체 생성 할 필요 X, 23번째 줄에서 했음. simmon이랑 같은 번호의 택시를 탔음  
		studentHa.showInfo();
		taxi.showInfo();
	
		
		
		Student studentBo = new Student("Bo", 3000);
		Bus bus506 = new Bus(506);
		studentBo.takeBus(bus506); //Bus타입형 변수 , 가진돈 -1000, 506번 버스 수입 + 1000, 승객 +1
		studentBo.showInfo();
		bus506.showInfo();
		
	}
	
	
}
