package h0625;

public class MyDateTest2 {

	public static void main(String[] args) {
		MyDate date2 = new MyDate(43,2,2022);
		
		if(date2.isValid()) {
			System.out.println("��ȿ�� ��¥�Դϴ�. ");
		} else {System.out.println("��ȿ���� ���� ��¥�Դϴ�. ");}

	}

}
