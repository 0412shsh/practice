package h0726;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //false, �� �ν��Ͻ� �ּ� ���� ������ ���Ͽ� ��� 
		System.out.println(str1.equals(str2)); //true, StringŬ������ equals()�޼��� ���, �� �ν��Ͻ��� ���ڿ� ���� ������ ���Ͽ� ��� 
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2); //false, �� �ν��Ͻ� �ּ� ���� ������ ���Ͽ� ��� 
		System.out.println(i1.equals(i2)); //true, IntegerŬ������ equals()�޼��� ���, �� �ν��Ͻ��� ���� ���� ������ ���Ͽ� ��� 
	}

}
