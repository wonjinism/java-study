import java.util.Scanner;
class CalculatorAdd
{
	public static void main(String[] args) {
		System.out.println("���� ���α׷�!");
		Scanner inputValue = new Scanner(System.in);
		System.out.print("�ǿ����� : ");
		int x = inputValue.nextInt();
		System.out.print("������ : ");
		int y = inputValue.nextInt();
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
		System.out.println("��� �Ͻðڽ��ϱ�?");
	}
}