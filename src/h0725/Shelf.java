package h0725;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //�ڷḦ ������� ������ ArrayList ����
	
	public Shelf() {
		shelf = new ArrayList<String>(); 
	} //����Ʈ �����ڷ� Shelf Ŭ������ �����ϸ� ArrayList�� ������ 

	public ArrayList<String> getShelf(){
		return shelf;
	} //shelf �� ��ȯ 
	
	public int getCount() {
		return shelf.size();
	} //����� ũ�⸦ ��ȯ
}
