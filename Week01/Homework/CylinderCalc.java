import java.util.Scanner;
class CylinderCalc
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int radius;
		int height;
		double pi = 3.14;
		double area;
		double volume;
		
		System.out.print("������� ������ : ");
		radius = input.nextInt();
		area = (radius *= radius) * pi;
		System.out.print("������� ���� : ");
		height = input.nextInt();
		volume = area * height;
		System.out.println("������� ���Ǵ� " + volume + "�Դϴ�.");
	}
}