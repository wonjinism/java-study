/* 
�� ������ �ݾ��� �Է¹޾� �޷�, ��ȭ �Ǵ� ����ȭ ������ �ݾ��� ����Ѵ�.

����
	1000���� 0.9�޷�, 102�� �Ǵ� 0.78���η� ����Ѵ�.
	�Է� �ݾ��� �����̰ų�, ����� ȭ�� ������ �߸� �Է��ϸ� ���� �޽����� ����ϰ� �����Ѵ�.
*/
import java.util.Scanner;
public class Test_181004_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int insert = 0;
		int select = 0;

		System.out.print("�� ���� �ݾ� �Է� : ");
		insert = input.nextInt();
		if (insert < 1) {
			System.out.println();
			System.out.println("�߸� �Է��߽��ϴ�.");
		} else { 
			System.out.print("ȯ���� ȭ�� (1:�޷�, 2:��ȭ, 3:����ȭ) : ");
			select = input.nextInt();
			switch (select) {
				case 1 : 
					System.out.println();
					System.out.println(insert + "���� " + insert * 0.0009 + "�޷��Դϴ�.");
					break;
				case 2 : 
					System.out.println();
					System.out.println(insert + "���� " + insert / 1000 * 102 + "���Դϴ�.");
					break;
				case 3 : 
					System.out.println();
					System.out.println(insert + "���� " + insert * 0.00078 + "�����Դϴ�.");
					break;
				default :
					System.out.println();
					System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
	}
}