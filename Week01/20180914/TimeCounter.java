import java.util.Scanner;
class TimeCounter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int unitMin = 60;
		int	unitHour = 3600;
		int inputSec;
		int outputHour;
		int outputMin;
		int outputSec;
		
		System.out.println("�ð��� �� ������ �Է��ϼ���.");
		inputSec = input.nextInt();
		outputHour = inputSec / unitHour;
		outputMin = (inputSec % unitHour) / unitMin;
		outputSec = inputSec - (outputHour * unitHour + outputMin * unitMin);
		System.out.println(inputSec + "�ʴ� " + outputHour + "�ð� " + outputMin + "�� " + outputSec + "�Դϴ�.");
	}
}