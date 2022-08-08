package h0808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("a.txt"); 
			
		}//try�� 
		catch (FileNotFoundException e){ //�Է¹��� ������ ���� ��쿡 ���� FileNotFoundException ����ó��
			System.out.println(e);  //���α׷��� �����ϸ� a.txt ������ ���� catch ��� ���� 
			return;
		}//catch��
		finally {
			if(fis != null) {
				try {
					fis.close(); //���� �Է� ��Ʈ�� �ݱ�
				} catch(IOException e) { //fis.close()������ ���� �߻����ɼ��� �־� ����ó�� �ؾ��� 
					e.printStackTrace();
				} //catch ��
			} //try ��
			System.out.println("�׻� ����˴ϴ�.");
		}//if �� 
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
