import java.util.Scanner;
class ScoreCounter 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int scoreKor;
		int scoreEng;
		int scoreMath;
		int scoreTotal;
		int countSub = 0;
		double scoreAvg;
		
		System.out.println("���������� �Է��ϼ���.");
		scoreKor = input.nextInt();
		countSub++;
		System.out.println("���������� �Է��ϼ���.");
		scoreEng = input.nextInt();
		countSub++;
		System.out.println("���������� �Է��ϼ���.");
		scoreMath = input.nextInt();
		countSub++;
		
		scoreTotal = scoreKor + scoreEng + scoreMath;
		scoreAvg = scoreTotal / countSub; // ����� : 88.0 // int�� int�� ���� ����� int
//		scoreAvg = (double)scoreTotal / countSub; // ����� : 88.333333 // int�� double�� ���� ����� double
//		scoreAvg = scoreTotal / (double)countSub; // ����� : 88.333333 // int�� double�� ���� ����� double

		System.out.println("�������� : " + scoreKor);
		System.out.println("�������� : " + scoreEng);
		System.out.println("�������� : " + scoreMath);
		System.out.println("���� : " + scoreTotal);
		System.out.println("��� : " + scoreAvg);
	}
}