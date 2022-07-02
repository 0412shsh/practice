package h0702;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		//ArrayList는 add와 remove를 통해 동적으로 변함 
		
		//add를 통해 값 집어 넣기
		numbers.add(100); //numbers[0]
		numbers.add(101); //numbers[1]
		numbers.add(102); //numbers[2]
		numbers.add(103); //numbers[3]
		numbers.add(104); //numbers[4]
		
		//넘버스 안에 들어간 값의 개수(사이즈)를 알고 싶다 
		System.out.println(numbers.size()); //5
		
		//인덱스2의 값을 지우고 싶다. 비어지는게 아니라 자리자체가 없어짐 ,102가 사라짐 
		numbers.remove(2);
		
		//향상된for문을 이용하여 numbers에 있는 데이터 출력 5 100 101 103 104
		for(int datas : numbers) System.out.println(datas);
		
		//numbers[4]에 104가 있는지 확인
		if(numbers.contains(104)) System.out.println("104 있음");
		else System.out.println("104없다");
		
		//인덱스 4에 있는 값을 알고 싶다
		//System.out.println(numbers.get(4)); 에러뜸
		System.out.println(numbers.get(3));  //104 출력
		System.out.println(numbers.get(2)); //103 출력
		
		
	}

}
