package h0625;

public class Goods {
	String name;
	String code;
	int soldNum;
	int stouckNum;
	
	public Goods(String name, String code, int soldNum, int stouckNum) {
		super();
		this.name = name;
		this.code = code;
		this.soldNum = soldNum;
		this.stouckNum = stouckNum;
	} //������ , Generate Constructor using field 

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getSoldNum() {
		return soldNum;
	}

	public void setSoldNum(int soldNum) {
		this.soldNum = soldNum;
	}

	public int getStouckNum() {
		return stouckNum;
	}

	public void setStouckNum(int stouckNum) {
		this.stouckNum = stouckNum;
	}
	
	public Goods() {}; //������ �����ε� , ���� �̸��� �����ڸ� ������ ���� �� �ִ�. 
	
	
}
