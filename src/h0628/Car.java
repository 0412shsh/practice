package h0628;

public class Car {
	static int carCount = 10000; 
	int carID;
	
	public Car() {
		carCount++;
		carID = carCount;
	}
	
	int getCarNum() {
		return carID;
	}
}
