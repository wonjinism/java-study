import java.util.Scanner;
public class Ifelseif
{
	public static void main(String[] args){
		System.out.println("������ �Է��ϼ��� : ");
		Scanner inputValue = new Scanner(System.in);
		int score = inputValue.nextInt();

		if ( score >= 90)
		{
			if ( score >= 95)
			{
			System.out.println("A+���� �Դϴ�.");
			} else {
			System.out.println("A-���� �Դϴ�.");
			}
		} else if ( score >= 80 )
		{
			System.out.println("B���� �Դϴ�.");
		} else if ( score >= 70 )
		{
			System.out.println("C���� �Դϴ�.");
		} else
		{
			System.out.println("D���� �Դϴ�.");
		}
	}
}