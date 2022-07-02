package h0702;

public class TwoDimension {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3,},{4,5,6,}}; //2За3ї­ 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println();
				System.out.println("arr["+i+"]["+j+"]= "+ arr[i][j]);
			}
		}
		System.out.println();
	}

}
