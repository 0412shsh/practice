package h0702;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		//ArrayList�� add�� remove�� ���� �������� ���� 
		
		//add�� ���� �� ���� �ֱ�
		numbers.add(100); //numbers[0]
		numbers.add(101); //numbers[1]
		numbers.add(102); //numbers[2]
		numbers.add(103); //numbers[3]
		numbers.add(104); //numbers[4]
		
		//�ѹ��� �ȿ� �� ���� ����(������)�� �˰� �ʹ� 
		System.out.println(numbers.size()); //5
		
		//�ε���2�� ���� ����� �ʹ�. ������°� �ƴ϶� �ڸ���ü�� ������ ,102�� ����� 
		numbers.remove(2);
		
		//����for���� �̿��Ͽ� numbers�� �ִ� ������ ��� 5 100 101 103 104
		for(int datas : numbers) System.out.println(datas);
		
		//numbers[4]�� 104�� �ִ��� Ȯ��
		if(numbers.contains(104)) System.out.println("104 ����");
		else System.out.println("104����");
		
		//�ε��� 4�� �ִ� ���� �˰� �ʹ�
		//System.out.println(numbers.get(4)); ������
		System.out.println(numbers.get(3));  //104 ���
		System.out.println(numbers.get(2)); //103 ���
		
		
	}

}
