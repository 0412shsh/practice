package h0625;

public class MyDateTest2 {

	public static void main(String[] args) {
		MyDate date2 = new MyDate(43,2,2022);
		
		if(date2.isValid()) {
			System.out.println("유효한 날짜입니다. ");
		} else {System.out.println("유효하지 않은 날짜입니다. ");}

	}

}
