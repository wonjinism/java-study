import java.util.Scanner;
class MultipleWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("� ���ڱ���? ");
		int limit = input.nextInt();
		System.out.print("�� ���? (2�� �̻�) ");
		int multiple = input.nextInt();
		int output = 1;
		while ( output <= limit)
		{
			System.out.print(output + " ");
			output = output * multiple;
		}
		System.out.println();
	}
}