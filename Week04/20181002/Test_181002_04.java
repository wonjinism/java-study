/* 
	2���� ������ �Է¹޾� ���� ������ ū�������� ���� ����ϼ���.
	
	������ :
	ù��° ���ڸ� �Է����ּ��� : 1
	�ι�° ���ڸ� �Է��� �ּ��� : 10
	55

	������ :
	ù��° ���ڸ� �Է����ּ��� : 5
	�ι�° ���ڸ� �Է��� �ּ��� : 1
	15
*/
import java.util.Scanner;
public class Test_181002_04 {
	public static void main(String[] args) {
		System.out.println("����� �ݺ���");
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int a = input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int b = input.nextInt();
		int sum = 0;
		if (a < b) {
			for (int i = a; a <=b; a++) {
				sum += a;
			}
		} /* else if (a == b) {
			sum = a + b; 
		} */else {
			for (int i = b; b <=a ; b++) {
				sum += b;
			}
		}
		System.out.println(sum);
	}
}