package h0629;

public class Ayr {
	//방법1. 배열변수 만들기
	int [] array1 = new int[5];
	// array1[0], array1[1], array1[2], array1[3], array1[4], array1.length = 5 (변수지만 상수처럼 값을 가지고 있음) , 초기값은 0으로 자동설정 
	
	boolean [] array2 = new boolean[2];
	// array2[0], array2[1] 초기값 false
	
	char [] array3 = new char[10];
	// array3[0], array3[1], ... array3[9] 초기값 '\u0000' 
	
	String [] array4 = new String[3];
	//array4[0], array4[1], array4[2] 초기값 null
	
	
	//방법2. 초기값을 지정하는 배열변수 만들기
	int [] datas = {100,101,102};
	// datas[0]=100, datas[1]=101, datas[2]=102, datas.length=3

	


}
