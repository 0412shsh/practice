package h0731;

public class StrintTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� �� " + System.identityHashCode(javaStr));
		
		javaStr= javaStr.concat(androidStr); // ���ڿ� javaStr�� ���ڿ� androidStr�� �����Ͽ� javaStr�� ����
		
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� ��: "+ System.identityHashCode(javaStr));
	}

}