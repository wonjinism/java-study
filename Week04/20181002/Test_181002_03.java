import java.util.Scanner;
public class Test_181002_03 {
	public static void main(String[] args) {
		System.out.println("�������� ���� �Է¹ް� �� �������� �ڹ� ������ �Է¹޾� ���հ� ����� ���");
		Scanner input = new Scanner(System.in);
		int students;
		int java;
		int studentScore[];
		int scoreTotal = 0;
		double scoreAvg;

		System.out.print("�������� �� : ");
		students = input.nextInt();
		studentScore = new int[students];
		for (int i = 0; i < students; i++ ) {
			System.out.print(i + 1 + "��° �л� Java���� : ");
			studentScore[i] = input.nextInt();
			scoreTotal += studentScore[i];
		}
		System.out.println();
		scoreAvg = (double)scoreTotal / students;
		System.out.println("Java���� ���� : " + scoreTotal);
		System.out.println("Java���� ��� : " + scoreAvg);
	}
}