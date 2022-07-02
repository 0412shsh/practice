package h0702;

public class ArrayA1 {

	public static void main(String[] args) {
		//char[] alpha1 = new char[26]; 
		char [][] alph = new char[13][2];
		//char형 배열 변수는 alph[0][0]~ alph[12][1] alph[0].length=13 alph[0]~alph[12] = 1 
		char ch = 'a';
		for(int i=0; i<alph.length; i++) {
			for(int j=0; j<alph[i].length; j++) {
				alph[i][j] = ch; 
				ch++;
			}
		}
		for(int i=0; i<alph.length; i++) {
			for(int j=0; j<alph[i].length; j++) {
				System.out.println("["+i+"]["+j+"] = "+alph[i][j]);
			
			}
			}
		
	}

}
