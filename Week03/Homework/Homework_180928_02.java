// 2. n���� ������ ���� �Է¹޾� �迭�� �����. 
//    �� �迭�� ���� ������ ���� ������ ��� ������ �־���Ѵ�.
//    ����� �� �迭�� Ư���� ������� �����ؾ��Ѵ�. �� ����� �Ʒ��� ����.
//    ���� ������ ���ʿ� ���� ������ ���ʿ� �־���ϸ�, 
//    ���� ������ ���� ������ �������� ������ ������Ѵ�.
// ���� ȭ�� : 
// -1 1 3 -2 2 ans -1 -2 1 3 2

import java.util.Scanner;
public class Homework_180928_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�迭�� ĭ�� �Է� : ");
		int array_length = input.nextInt();
		int[] arr = new int[array_length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭[" + i + "] = ");
			arr[i] = input.nextInt();
		}
		// ������ ã�Ƽ� ������ �ƴ� ������ ������ �� �о�鼭 �ִ´�. �ִ� n/2��ŭ �о��?
		int temp = 0;
		int moveTo = 0; // ������ �Ű��� ��ġ
		for (int i = 0; i < arr.length; i++) {
			if (i == moveTo && arr[i] < 0) { // �̹� ������ �� �������� ��ġ�� �̵�
				moveTo++;
			}

			else if (i != moveTo && arr[i] < 0) {
				temp = arr[moveTo];
				arr[moveTo] = arr[i];
				
				for (int j = i; j > moveTo + 1; j--) { // �ڷ� �б�
					arr[j] = arr[j -1];
				}
				arr[moveTo + 1] = temp;
				moveTo++;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
}