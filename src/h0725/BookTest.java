package h0725;

public class BookTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf(); //
		shelfQueue.enQueue("불삼 1"); //순서대로 요소 추가 
		shelfQueue.enQueue("불삼 2");
		shelfQueue.enQueue("불삼 3");
		
		System.out.println(shelfQueue.deQueue()); //입력 순서대로 요소를 꺼내서 출력 
		System.out.println(shelfQueue.deQueue()); 
		System.out.println(shelfQueue.deQueue()); 
	}

}
