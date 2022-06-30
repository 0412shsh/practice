package h0630;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int [] lotto = new int[7];
		Random rand = new Random(); //객체생성, 임포트
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1; // 45: 0~44까지의 값 나타냄 +1 할경우 1~45 
			
		}
		Arrays.sort(lotto); //오름차순 정렬
		System.out.println(Arrays.toString(lotto)); //배열안에 있는 값 모두 표시
	}

}
