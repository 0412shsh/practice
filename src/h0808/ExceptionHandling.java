package h0808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt"); //a.txt ���Ͽ��� �����͸� �о� ���̱� ���� ��Ʈ�� ��ü�� �����Ѵٴ� �ǹ� 
		} catch (FileNotFoundException e) { //try������ �߻��� �� �ִ� ���ܿ� �����̸�
			//e.printStackTrace(); // ���ܰ� ��� �߻��߳� �����ϴ� �޼��� 
			System.out.println(e); //���� Ŭ������ e.toString()�޼��� ȣ�� 
		} 
		System.out.println("���⵵ ����˴ϴ�."); //���� ��� 
	} 

}
