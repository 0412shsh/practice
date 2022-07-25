package h0725;

public class BookShelf extends Shelf implements Queue{
		@Override
		public void enQueue(String title) {
			shelf.add(title); //배열에 요소추가	
		}
		
		@Override
		public String deQueue() {
			return shelf.remove(0); //맨 처음 요소를 배열에서 삭제하고 반환
		}
		
		@Override
		public int getSize() {
			return getCount(); //배열요소 반환
		}
}
