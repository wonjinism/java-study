package calc;

public class CallByValue {
	public int x;
	public int y;
	
	public static void swap(int a, int b) {
		System.out.println("(�ż��� �۾� ��)����� �Ű����� a��  �� :" + a + "����� �Ű����� b�� �� :" + b);
		int temp = a;
		a = b;
		b = temp;		
		System.out.println("(�ż��� �۾� ��)����� �Ű����� a��  �� :" + a + "����� �Ű����� b�� �� :" + b);
	}

	public static void main(String[] args) {

		int a1 = 10;
		int b1 = 20;
		System.out.println("a1 : " + a1 + " b1 : " + b1); //swap �ż��� ȣ�� ��
		swap(a1,b1);									  //swap ȣ��               -> �Ű������� ���� �ż���� ����Ǿ� �����.
		System.out.println("a1 : " + a1 + " b1 : " + b1); //swap �ż��� ȣ�� �� -> ����� �Ű������� ���� �ٸ� �ּҸ� �����Ƿ� ���� �Ű������� ���� ���ϴ� ���� �ƴ�
	}
}