/*
���� 10��¥�� char�� �迭�� �����ϰ� ���ĺ� �빮�ڸ� ���Ƿ� �����Ѵ�. 
�� �迭�� ������ A~F, Q~Z ������ ���ڴ� ��� *�� �����Ѵ�.

HINT
char���� ������ �ڵ尪�� ���������� �����ϴ� �ڷ����̴�. 'A'�� �ڵ� ������ 1 ū ���ڴ� 'B'�̴�.
*/
import java.util.Random;
public class Test_181004_02 {
	public static void main(String[] args) {
		Random rnd = new Random();
		char arr[] = new char[10];

		System.out.print("* ���� �� : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char)(65 + rnd.nextInt(26));
			System.out.print(arr[i]);
		}

		System.out.println();
		System.out.print("* ���� �� : ");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= 'A' && arr[i] <= 'F') || (arr[i] >= 'Q' && arr[i] <= 'Z')) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
