import java.util.Scanner;
public class ArrayTest_180928_01 {
	public static void main(String[] args) {
		System.out.println("�迭 �� �հ� ���ϱ�");
		/* ���� : �迭�� ������ �Է¹޾� �迭�� �����ϰ�
				�� �迭�� ���� �Է¹޾� ������ ��,
				�迭�� ����ִ� ��ü ������ �հ踦 ���Ͽ� ����Ѵ�.*/
		Scanner input = new Scanner(System.in);
		int arrayLength = 0;
		while (true) {
			System.out.print("�迭�� ���� : ");
			arrayLength = input.nextInt();
			if (arrayLength > 2) {
				break;
			} 
			System.out.println("2 �̻��� ���� �Է��ϼ���.");
		}
		int[] arrSum = new int[arrayLength];
		for (int i = 0; i < arrSum.length; i++) {
			System.out.print("�迭[" + i + "] : ");
			arrSum[i] = input.nextInt();
		}	
		int sum = 0;
		for (int i = 0; i < arrSum.length; i++) {
			System.out.print(arrSum[i]);
			sum += arrSum[i];
			if ( i < arrSum.length - 1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
	}
}