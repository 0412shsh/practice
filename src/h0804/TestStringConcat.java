package h0804;

import java.util.Scanner;

class StringConcatImp1 implements StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+",,,"+s2+",,,��");	
	}
}
public class TestStringConcat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�������̽� �����ϱ�
		System.out.println("========�� �ؿԴ� ��� ==========");
		System.out.println("���ڿ�1 �Է� >> ");
		String s1 = sc.next();
		System.out.println("���ڿ�2 �Է�>> ");
		String s2 = sc.next();
		//String s1 = �ȳ�;
		//String s2 = �ϻ�;
		
		StringConcatImp1 concat1 = new StringConcatImp1();
		concat1.makeString(s1, s2);
		System.out.println();
		
		System.out.println("=========���ٽ�����============");
		StringConcat concat2 = (s,v)->System.out.println(s+",,,"+v+",,,");
		concat2.makeString(s1, s2);
		
		
	}

}