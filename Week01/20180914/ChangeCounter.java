import java.util.Scanner;
class ChangeCounter
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int price;
		int receiveMoney;
		int change;

		System.out.println("��ǰ�ݾ��� �Է��ϼ��� : ");
		price = input.nextInt();
		System.out.println("���� ���� �Է��ϼ��� : ");
		receiveMoney = input.nextInt();
		change = price - receiveMoney;
		System.out.println("�Ž������� " + change + "�Դϴ�.");
	}
}