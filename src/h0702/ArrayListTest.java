package h0702;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) { 
		ArrayList<Book> library = new ArrayList<>(); //BookŬ������ ��� 
		
		library.add(new Book("����","a�۰�")); //library[0] add�� ���� ���� ���� �ִ´�
		library.add(new Book("����","b�۰�")); //library[1]
		library.add(new Book("�ٴ�","c�۰�"));//library[2]
		library.add(new Book("���","d�۰�"));//library[3]
		library.add(new Book("���","e�۰�"));//library[4]
		
		for (int i=0; i<library.size(); i++) {
			Book book = library.get(i); //0~4���� �������� �Է��� ������ �����ͼ� BookŬ������ �ִ´� -> ��������� ���� 
					book.showInfo();    //showInfo�޼��带 ����ؼ� �������� 
		}
			System.out.println();
			
			System.out.println("==���� for�� ===");
			for(Book book : library) {
				book.showInfo();
			}
	}

}
