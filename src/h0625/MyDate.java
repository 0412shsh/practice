package h0625;

public class MyDate {
	private int day, month, year; //���� ����
	
	public boolean isValid() {
		if(month == 2) {
			if(day< 1 || day>28) {return false;
			}
		}return true;
	} //�޼���

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;	
	} //��ü ����

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
