import java.util.Scanner;
public class LoopCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("���� ���α׷�!");
		double x;
		int y; 
		String op; // 4Ģ ������
		double result = 0;
		int loopCheck = 0;
		boolean startCheck = true;

	while ( loopCheck == 0) {
		if ( startCheck == true) { 
			System.out.print("�ǿ����� : ") ;
			x = input.nextInt();
			input.nextLine(); // �� nextInt() �Է� �� enter ���� ������ }
		} else {
			x = result;
			System.out.println("�ǿ����� : " + x);
			input.nextLine(); // �� nextInt() �Է� �� enter ���� ������ }
		}
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
			result = x / (double)y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		default :
			System.out.println("��Ģ�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		startCheck = false;
		System.out.print("�̾ ����Ͻðڽ��ϱ�?(0) : ");
		loopCheck = input.nextInt();
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