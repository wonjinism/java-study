/* 
������ȣ�� �Է��ϰ� ����� ��ȣ�� ������� ���
1) ������ ������ 10���� ���� �� �ִ� �迭
2) ����ڿ��� ���� Ÿ���� ��ȣ�� 10�� �Է� ����
3) �Է��� �Ϸ�Ǹ� ���� �迭�� ����� ��ȣ�� ���ʴ�� ���
*/

/* 
�߰� 1) �迭�� ���ڸ� ����ڿ��� ����
�߰� 2) �������� �迭
*/
import java.util.Scanner;
public class QuizBookCode2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��� ������ ������ �Է��ϼ��� : ");
		int a = input.nextInt();
		int[] bookCode = new int[a];
		for (int i = 0; i < bookCode.length; i++) {
			System.out.print("������ȣ�� �Է��ϼ��� : ");
			bookCode[i] = input.nextInt();
		}
		
		int temp = 0;
		for(int i = 0; i < bookCode.length; i++) {
			for (int j = i + 1; j < bookCode.length; j++) {
				if ( bookCode[i] > bookCode[j]) {
					temp = bookCode[i];
					bookCode[i] = bookCode[j];
					bookCode[j] = temp;
				}
			}
		}
		for(int i = 0; i < bookCode.length; i++) {
			System.out.print(bookCode[i] + " ");
		}
		System.out.println();
	}
}