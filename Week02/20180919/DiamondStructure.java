//6. �ﰢ�� �ȿ� ���� ���ﰢ��(���� ����)
import java.util.Scanner;
public class DiamondStructure
{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		System.out.print("���ϴ� �� ũ���? (¦��) ");
		int input = inputValue.nextInt();
		int diaSize = input / 2; // �� ���ڰ� ���� ���� �� ��
		// ���̾� ũ��� ��� ���� ������ �ʴ� �� ����
		int noneStar = diaSize - 1; // ù ���� �¿� ���� ��
		int recordStar = diaSize - noneStar; // ù �� ���� ��
		int increaseStar = 2; //�� ��° �ٺ��� �� ���� �����ϴ� ���� �� = 2		

		for (int i = 1; i <= diaSize ; i++){ // �� 
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
		
		noneStar = diaSize -1;
		recordStar = diaSize + noneStar; // ù ���� ���� ���ڸ� �ٲٰ� ����.
		noneStar = 0;
		for (int i = 1; i <= diaSize; i++){ // �� 

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