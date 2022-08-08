package h0808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("a.txt"); 
			
		}//try끝 
		catch (FileNotFoundException e){ //입력받은 파일이 없는 경우에 대해 FileNotFoundException 예외처리
			System.out.println(e);  //프로그램을 실행하면 a.txt 파일이 없어 catch 블록 수행 
			return;
		}//catch끝
		finally {
			if(fis != null) {
				try {
					fis.close(); //파일 입력 스트림 닫기
				} catch(IOException e) { //fis.close()에서도 예외 발생가능성이 있어 예외처리 해야함 
					e.printStackTrace();
				} //catch 끝
			} //try 끝
			System.out.println("항상 수행됩니다.");
		}//if 끝 
		System.out.println("여기도 수행됩니다.");
	}

}
