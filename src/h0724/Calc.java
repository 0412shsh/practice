package h0724;

public interface Calc {
	double PI = 3.14; 
	int ERROR = -999999999; //�������̽����� �����ϴ� ������ ������ �������� ����� ���� (final ��������) 
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2); //�������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ�� (abstract ��������) 
	
	int square(int num);
	
	
}