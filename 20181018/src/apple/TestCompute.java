package apple;

import java.util.Scanner;

public class TestCompute {

	public static void main(String[] args) {
		// ���� �Է¹޾� �޼��� ȣ���Ͽ� ó��
		// ����1. �Է¹��� ���� compute(item, qty, price)���� ó��
		// ����2. ����� : �ݾ� = ���� X �ܰ�
		//������ :
		//-�Է�-
		//ǰ�� : apple
		//���� : 10
		//�ܰ� : 12000
		//
		//-���-
		//ǰ��:apple
		//�ݾ�:120000
		
		Scanner input = new Scanner(System.in);
		System.out.println("-�Է�-");
		System.out.print("ǰ�� : ");

		String a = input.nextLine();
		System.out.print("���� : ");
		int b = input.nextInt();
		System.out.print("�ܰ� : ");
		int c = input.nextInt();
		System.out.println();


		System.out.println("-���-");
		Calc A1 = new Calc();
		A1.compute(a, b, c);		
		
		
		
	}

}
