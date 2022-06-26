package p0626;

public class Company {
	private static Company instance = new Company(); // Ŭ���� ���ο� static���� ������ �ν��Ͻ� ����
	private Company() {} //private ������
	
	public static Company getInstance() { //�ܺ�Ŭ���������� Company�� ������ �� �����Ƿ�, static���� �����ϴ� getInstance() �޼��� ȣ�� 
		if(instance == null) {
			instance = new Company();
		}
		return instance;  //�����ϰ� ������ �ν��Ͻ� ��ȯ , �ν��Ͻ��� �ܺο��� ������ �� �ֵ��� public get() �޼��� ����
	
	}
}
