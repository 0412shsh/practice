package h0630;

public class Company {
	private static Company instance = new Company(); //������ �ν��Ͻ�
	private Company() {} //������
	
	
	public static Company getInstance() {
	 if (instance == null) {
		 instance = new Company();
	 }
		
		return instance; //�� ���� new Company();
	}
	
	
}
