/*
���� 10���� �Է¹޾�, �� ������ ��հ� 10 �̻� ���̳��� �������� ����Ѵ�.
*/
import java.util.Scanner;
public class Test_181004_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭[" + i + "] : ");
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		avg = (double)sum / arr.length;
		System.out.println();
		System.out.println("��� : " + avg);
		System.out.print("��հ� 10 �̻� ���̳��� �� : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg + 10 || arr[i] < avg - 10) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
