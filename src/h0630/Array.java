package h0630;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array1 = new int[3];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<array1.length; i++) {
			System.out.println("������ �Է� >> ");
			array1[i]=sc.nextInt();
			sum+=array1[i];
			
			if(max<array1[i]) max=array1[i]; //max���� array1���� �� ũ�ٸ� ~ max�� �ִ´�
			
			if(min>array1[i]) min =array1[i]; //min���� array1���� �� �۴ٸ� ~ min�� �ִ´�
			
			System.out.println("�հ� : "+sum);
		}
	
		for(int i=0; i<array1.length; i++) {
			System.out.println("array1["+i+"]="+array1[i]);
		}
		System.out.println("�հ� : "+ sum);
		System.out.println("�ִ밪 : "+ max);
		System.out.println("�ּҰ� : "+ min);
	}	

}
