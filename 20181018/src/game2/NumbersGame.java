package game2;

import java.util.Scanner;

public class NumbersGame {

	public static void main(String[] args) {
		// ���ڸ��߱� ����
		// 0~100 ������ ������ ���� �ϳ� ����
		// ������ :
		// �����Է�(0~100) : 50
		// ũ��
		//
		// �����Է�(0~100) : 60
		// �۴�
		//
		// �����Է�(0~100) : 55
		// �¾Ҵ�(3��)
		//
		// ���(y/n) : y
		// �����Է�(0~100) : 60

		Scanner scanner = new Scanner(System.in);
		int a = (int) (Math.random() * 100) + 1; // ������
		int num = 0;
		int count = 0;

		for (;;) {
			System.out.print("�����Է�(0~100) : ");
			num = scanner.nextInt();
			if (a > num) {
				System.out.println("ũ��");
				count += 1;
				continue;
			} else if (a < num) {
				System.out.println("�۴�");
				count += 1;
				continue;
			} else {
				count += 1;				
				System.out.println("�¾Ҵ�(" + count + "��)");
				break;
			}
		}
		
		
	}
}
/*System.out.print("����Ͻðڴ�?(y/n) : ");
String y = input.nextLine();

if (y == "y") {
	continue;
} else {
	break;
}
*/