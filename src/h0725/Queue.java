package h0725;

public interface Queue {
	void enQueue(String title); //배열의 맨 마지막에 추가, 추상메서드
	String deQueue(); //배열의 맨 처음 항목 제거, 반환 , 추상메서드
	int getSize(); //현재 Queue에 있는 개수 반환 
}
