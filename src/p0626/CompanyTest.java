package p0626;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance(); // Ŭ���� �̸����� getInstance()ȣ���Ͽ� ���������� ����
		
		System.out.println(myCompany1 == myCompany2); // true

		
		/*Company myCompany1 = new Company(); �� private�� �ٸ� Ŭ�������� ��� �Ұ�
		 *Company myCompany2 = new Companu(); ->[���赵] private static Company instance = new Company(); 
		 *�ݵ�� CompanyŸ���� �;��Ѵ�. Company.getInstance(); => Ŭ������.�޼���*/
	}

}
