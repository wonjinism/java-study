import java.util.Scanner;
public class StarStructure
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
			for (int j = 1; j <= noneStar; j++ ){ // noneStar��ŭ ���� �� �� �׷��ֱ�
				System.out.print("��");
			}
			for (int k = 1; k <= recordStar; k++){
				System.out.print("��");
			}
			for (int l = 1; l <= noneStar; l++ ){ // �� �׸� �� noneStar��ŭ ���� �� �ٹٲ�
				System.out.print("��");
			}
			System.out.println();
			noneStar--;
			recordStar += increaseStar;
		}
		
		System.out.println();
		noneStar = starSize -1;
		recordStar = starSize + noneStar; // ù ���� ���� ���ڸ� �ٲٰ� ����.
		noneStar = 0;
		for (int i = 1; i <= starSize; i++){ // �� 
			for (int j = 1; j <= noneStar; j++ ){ // noneStar��ŭ ���� �� �� �׷��ֱ�
				System.out.print("��");
			}
			for (int k = 1; k <= recordStar; k++){
				System.out.print("��");
			}
			for (int l = 1; l <= noneStar; l++ ){ // �� �׸� �� noneStar��ŭ ���� �� �ٹٲ�
				System.out.print("��");
			}
			System.out.println();
			noneStar++;
			recordStar -= increaseStar;
		}
	}
}