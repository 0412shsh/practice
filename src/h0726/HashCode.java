package h0726;

public class HashCode {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode()); //abc ���ڿ��� �ؽ� �ڵ� �� ���
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		
		System.out.println(i1.hashCode()); //Integer(100)�� �ؽ� �ڵ� �� ���
		System.out.println(i2.hashCode());
		
	}

}