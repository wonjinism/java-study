// 1. ���� �ﰢ��
import java.util.Scanner;
public class Quiz_leftTriangle
{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		System.out.print("���ϴ� ��ž�� ������? ");
		int starSize = inputValue.nextInt(); // �� ���� ����
		// ���� ũ��� ��� ���� ������ �ʴ� �� ����
		int noneStar = starSize - 1; // ù ���� �¿� ���� ��
		int recordStar = starSize - noneStar; // ù �� ���� ��
		int increaseStar = 2; //�� ��° �ٺ��� �� ���� �����ϴ� ���� �� = 2		

		for (int i = 1; i <= starSize; i++){ // �� 
			for (int k = 1; k <= recordStar; k++){
				System.out.print("��");
			}
			System.out.println();
			noneStar--;
			recordStar++;
		}
	}
}