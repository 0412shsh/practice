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
			System.out.println("정수를 입력 >> ");
			array1[i]=sc.nextInt();
			sum+=array1[i];
			
			if(max<array1[i]) max=array1[i]; //max보다 array1값이 더 크다면 ~ max에 넣는다
			
			if(min>array1[i]) min =array1[i]; //min보다 array1값이 더 작다면 ~ min에 넣는다
			
			System.out.println("합계 : "+sum);
		}
	
		for(int i=0; i<array1.length; i++) {
			System.out.println("array1["+i+"]="+array1[i]);
		}
		System.out.println("합계 : "+ sum);
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}	

}
