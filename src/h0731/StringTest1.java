package h0731;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2= new String("abc");
		
		System.out.println(str1 == str2);  //인스턴스가 매번 새로 생성되므로 str1과 str2의 주소값 다름
		System.out.println(str1.equals(str2)); //문자열 값은 같으므로 true 반환
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //문자열 abc는 상수 풀에 저장되어 있으므로 str3과 str4가 가르키는 주소값 동일
		System.out.println(str3.equals(str4)); //문자열 값도 같으므로 true반환 
	}

}
