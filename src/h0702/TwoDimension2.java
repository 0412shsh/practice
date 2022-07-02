package h0702;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3]; //2행 3열 

		for(int i=0; i<arr.length; i++) { //2행
			for(int j=0; j<arr.length; j++) {  //3열
				System.out.println(arr[i][j]); //초기값 0 자동 설정
			}
		System.out.println();
		}
		System.out.println(arr.length); 
		System.out.println(arr[0].length); 
		System.out.println(arr[1].length); 
	}

}
