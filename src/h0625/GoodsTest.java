package h0625;

public class GoodsTest {

	public static void main(String[] args) {
		//Goods g1 = new Goods(); => ����! ���赵���� ��ȣ �ȿ� �Է°� �־���Ѵ�. 
		Goods g1 = new Goods("������", "a1234", 10, 5);
		System.out.println("��ǰ��: "+ g1.getName() + " �ڵ��ȣ : " + g1.getCode() + " �Ǹŷ� : "+ g1.getSoldNum() 
							+ "�� ���� : "+ g1.getStouckNum()+"��"); 
	
		Goods g2;
		g2 = new Goods("����е�", "b1234", 5, 15);
		System.out.println("��ǰ��: "+ g2.getName() + " �ڵ��ȣ : " + g2.getCode() + " �Ǹŷ� : "+ g2.getSoldNum() 
							+ "�� ���� : "+ g2.getStouckNum()+"��");
	
		
		Goods g3 = new Goods(); // ������ �����ε� ���� ���� -> ��ȣ �� ��ĭ���� ���� ���� GoodsŬ���� 50��°�� 
	}

}
