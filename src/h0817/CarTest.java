package h0817;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===����������===");
		Car myCar = new AICar(); 
		myCar.run();
		
		System.out.println("===����� �����ϴ� ��===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
