package h0808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt"); //a.txt 파일에서 데이터를 읽어 들이기 위해 스트림 객체를 생성한다는 의미 
		} catch (FileNotFoundException e) { //try문에서 발생할 수 있는 예외와 변수이름
			//e.printStackTrace(); // 예외가 어디서 발생했나 추적하는 메서드 
			System.out.println(e); //예외 클래스의 e.toString()메서드 호출 
		} 
		System.out.println("여기도 수행됩니다."); //정상 출력 
	} 

}
