import java.util.Scanner;
public class CalculatorFour {
	public static void main(String[] args) {
		System.out.println("���� ���α׷�!");
		int x, y; 
		String op; // 4Ģ ������
		int result;

		Scanner input = new Scanner(System.in);	
		System.out.print("�ǿ����� : ");
		x = input.nextInt();
		input.nextLine(); // �� nextInt() �Է� �� enter ���� ������
		System.out.print("����ȣ(+-*/) : ");
		op = input.nextLine(); 
		System.out.print("������ : ");
		y = input.nextInt();

		switch (op) {
		case "+" :
			result = x + y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		case "-" :
			result = x - y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		case "*" :
			result = x * y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		case "/" :
			float resultFloat = x / (float)y;
			System.out.println(x + " " + op + " " + y + " = " + resultFloat);
			break;
		default :
			System.out.println("��Ģ�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
			break;
		}
/*
		if ( op == "+" ) {
			result = x + y;
			System.out.println(x + op + y + " = " + result);
		} else if ( op == "-" ) {
			result = x - y;
			System.out.println(x + op + y + " = " + result);
		} else if ( op == "*" ) {
			result = x * y;
			System.out.println(x + op + y + " = " + result);
		} else if ( op == "/") {
			float resultFloat = x / (float)y;
			System.out.println(x + op + y + " = " + resultFloat);
		} else {
			System.out.println("��Ģ�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
*/
	}
}