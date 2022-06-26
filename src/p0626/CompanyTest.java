package p0626;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance(); // 클래스 이름으로 getInstance()호출하여 참조변수에 대입
		
		System.out.println(myCompany1 == myCompany2); // true

		
		/*Company myCompany1 = new Company(); 는 private라 다른 클래스에서 사용 불가
		 *Company myCompany2 = new Companu(); ->[설계도] private static Company instance = new Company(); 
		 *반드시 Company타입이 와야한다. Company.getInstance(); => 클래스명.메서드*/
	}

}
