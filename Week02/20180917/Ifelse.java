import java.util.Scanner;
class Ifelse
{
	public static void main(String[] args){
		System.out.println("������ �Է��ϼ��� : ");
		Scanner inputValue = new Scanner(System.in);
		int score = inputValue.nextInt();

		if ( score >= 70)
		{
			System.out.println("�հ� �Դϴ�.");
		} else {
			System.out.println("���հ� �Դϴ�.");
		}
	}
}