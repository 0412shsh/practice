package h0625;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentRaymond = new Student("Raymond",10000);
		Bus bus111 = new Bus(111); // 111�� ���� ����
		studentRaymond.takeBus(bus111); //������ -1000��, 111�� ���� ���� +1000��, �°��� +1 
		studentRaymond.showInfo();
		bus111.showInfo();
	
	
		
		Student studentJerome = new Student("Jerome", 50000);
		Subway red = new Subway("1ȣ��"); //1ȣ�� ����ö ����
		studentJerome.takeSubway(red); //������ -1500, 1ȣ�� ���� +1500, �°��� +1 
		studentJerome.showInfo();
		red.showInfo();
		
		
		
		Student studentSimmon = new Student("Simmon", 100000);
		Taxi taxi = new Taxi("��1234"); //��1234 �ý� ����
		studentSimmon.takeTaxi(taxi); //taxiŸ���� ����, ������ -4000, ��1234 ���� +4000, �°��� +1
		studentSimmon.showInfo();
		taxi.showInfo();
		
		
		Student studentHa = new Student("Ha", 1000000);
		studentHa.takeTaxi(taxi);  //��ü ���� �� �ʿ� X, 23��° �ٿ��� ����. simmon�̶� ���� ��ȣ�� �ýø� ����  
		studentHa.showInfo();
		taxi.showInfo();
	
		
		
		Student studentBo = new Student("Bo", 3000);
		Bus bus506 = new Bus(506);
		studentBo.takeBus(bus506); //BusŸ���� ���� , ������ -1000, 506�� ���� ���� + 1000, �°� +1
		studentBo.showInfo();
		bus506.showInfo();
		
	}
	
	
}
