import java.util.Scanner;
class VarTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // ���� �ý��ۿ� ���� �Է¿� �ش��ϴ� ��ȣ�� ��ĳ�ʿ� �شٴ� �ǹ�
		int num;
		boolean result;

		System.out.println("�����Է� : ");
		num = input.nextInt(); // �� �κп� ��ǻ�Ͱ� �ν��ϸ�, �������� ���ڸ� �Է��ϰ� ����ġ�� ���͸� �ν��ؼ� ���� ���ڸ� num�� �Է�
		result = num > 0; 
		System.out.println("num�� �� : " + num);
		System.out.println("result�� �� : " + result);
	}
}