/* 
������ȣ�� �Է��ϰ� ����� ��ȣ�� ������� ���
1) ������ ������ 10���� ���� �� �ִ� �迭
2) ����ڿ��� ���� Ÿ���� ��ȣ�� 10�� �Է� ����
3) �Է��� �Ϸ�Ǹ� ���� �迭�� ����� ��ȣ�� ���ʴ�� ���
*/
import java.util.Scanner;
public class QuizBookCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] bookCode = new int[10];
		for (int i = 0; i < bookCode.length; i++) {
			System.out.print("������ȣ�� �Է��ϼ��� : ");
			bookCode[i] = input.nextInt();
		}
		for(int i = 0; i < bookCode.length; i++) {
			System.out.print(bookCode[i] + " ");
		}
		System.out.println();
	}
}