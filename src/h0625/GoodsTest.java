package h0625;

public class GoodsTest {

	public static void main(String[] args) {
		//Goods g1 = new Goods(); => 오류! 설계도참고 괄호 안에 입력값 넣어야한다. 
		Goods g1 = new Goods("퐁퐁폰", "a1234", 10, 5);
		System.out.println("제품명: "+ g1.getName() + " 코드번호 : " + g1.getCode() + " 판매량 : "+ g1.getSoldNum() 
							+ "대 재고수 : "+ g1.getStouckNum()+"대"); 
	
		Goods g2;
		g2 = new Goods("방방패드", "b1234", 5, 15);
		System.out.println("제품명: "+ g2.getName() + " 코드번호 : " + g2.getCode() + " 판매량 : "+ g2.getSoldNum() 
							+ "대 재고수 : "+ g2.getStouckNum()+"대");
	
		
		Goods g3 = new Goods(); // 생성자 오버로드 설계 참고 -> 괄호 안 빈칸으로 유지 가능 Goods클래스 50번째줄 
	}

}
