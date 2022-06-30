package h0630;

public class Array1 {

	public static void main(String[] args) {
		//char [] al = new char[26]; //1차원 배열
		char [][] al = new char [13][2];
		//char형 배열변수 al[0][0]~ al[12][1] al.length = 13   al[0]~ al[12].length=2
		char ch = 'a';
		for(int i=0; i<al.length; i++) {
			for(int j=0; j<al[j].length; j++) {
				al[i][j]=ch; // (0,0) (0,1) (1,0) (1,1) ... (12,0) (12,1)
				ch++;
			}
		}
		for(int i=0; i<al.length; i++) {
			for(int j=0; j<al[j].length; j++) {
				System.out.println("al["+i+"]"+"["+j+"]= "+al[i][j]);
				}
			}
	}

}
