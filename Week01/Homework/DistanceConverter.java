import java.util.Scanner;
class DistanceConverter
{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double unitInch = 2.54;
	int inputCM;
	double outputInch;

	System.out.print("길이 입력 (cm단위) : ");
	inputCM = input.nextInt();
	outputInch = inputCM / unitInch;
	System.out.println(inputCM + " cm = " + outputInch + " inch");
	}
}