//4. ���� ���� �ﰢ��
import java.util.Scanner;
public class Quiz_leftTriangle2
{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		System.out.print("���ϴ� ��ž�� ������? ");
		int starSize = inputValue.nextInt(); // �ִ� ���� ����
		// ���� ũ��� ��� ���� ������ �ʴ� �� ����
		int noneStar = starSize - 1; // �ִ� ���� �� �� �� �Ʒ� ������ ��
		int recordStar = starSize - noneStar; // ù �� ���� ��
		int increaseStar = 1; //�� ��° �ٺ��� �� ���� �����ϴ� ���� ��		

		for (int i = 1; i <= starSize - 1; i++){ // �� 
			for (int k = 1; k <= recordStar; k++){
				System.out.print("��");
			}
			System.out.println();
			recordStar += increaseStar;
		}

		for (int i = 1; i <= starSize; i++){ // �� 
			for (int k = 1; k <= recordStar; k++){
				System.out.print("��");
			}
			System.out.println();
			recordStar -= increaseStar;
		}
	}
}