package h0725;

public class BookTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf(); //
		shelfQueue.enQueue("�һ� 1"); //������� ��� �߰� 
		shelfQueue.enQueue("�һ� 2");
		shelfQueue.enQueue("�һ� 3");
		
		System.out.println(shelfQueue.deQueue()); //�Է� ������� ��Ҹ� ������ ��� 
		System.out.println(shelfQueue.deQueue()); 
		System.out.println(shelfQueue.deQueue()); 
	}

}
