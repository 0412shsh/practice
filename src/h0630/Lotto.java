package h0630;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int [] lotto = new int[7];
		Random rand = new Random(); //��ü����, ����Ʈ
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1; // 45: 0~44������ �� ��Ÿ�� +1 �Ұ�� 1~45 
			
		}
		Arrays.sort(lotto); //�������� ����
		System.out.println(Arrays.toString(lotto)); //�迭�ȿ� �ִ� �� ��� ǥ��
	}

}
