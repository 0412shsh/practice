package h0702;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) { 
		ArrayList<Book> library = new ArrayList<>(); //Book클래스형 사용 
		
		library.add(new Book("가가","a작가")); //library[0] add를 통해 값을 집어 넣는다
		library.add(new Book("나나","b작가")); //library[1]
		library.add(new Book("다다","c작가"));//library[2]
		library.add(new Book("라라","d작가"));//library[3]
		library.add(new Book("사사","e작가"));//library[4]
		
		for (int i=0; i<library.size(); i++) {
			Book book = library.get(i); //0~4까지 돌때마다 입력한 값들을 가져와서 Book클래스에 넣는다 -> 멤버변수로 세팅 
					book.showInfo();    //showInfo메서드를 사용해서 가져오기 
		}
			System.out.println();
			
			System.out.println("==향상된 for문 ===");
			for(Book book : library) {
				book.showInfo();
			}
	}

}
