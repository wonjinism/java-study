import java.util.Scanner;
class AddTenTimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num; 
		for (int i = 1; i <= 10; i++ ) {
			System.out.print("���� �Է� : ");
			num = input.nextInt();
			sum += num;
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
	}
}