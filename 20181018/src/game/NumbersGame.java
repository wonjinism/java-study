package game;

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

		Scanner Input = new Scanner(System.in);
		int a = (int)(Math.random() * 100) + 1; // ������
		Answer ans = new Answer();
		String reply;
		
		for (;;) {
			System.out.print("�����Է�(0~100) : ");
			int num = Input.nextInt();
			
			reply = ans.Measure(num, a);
			if(reply=="A" || reply=="B") {
				continue;
			}
			
			System.out.print("����Ͻðڴ�?(y/n) : ");
			String y = Input.next();
			
			if (y.equals("y")) {
				continue;
			} else {
				break;
			}
		}
	}
}
