import java.util.Scanner;
public class Test_181001_02 {
	public static void main(String[] args) {
		System.out.println("�޴���ȣ �� �޴����� �Է¹޾Ƽ� ����ϱ�");
		// ����ȭ�� : 
		// ��ȣ�� �����Ͻÿ�
		// 1. �޴����, 2. ���, 0. ����;
		// ��ȣ : 
		// ����� �޴��� �Է��ϼ���
		// �޴��� :
		// ������ ����� �ּ���
		// ���� : 
		
		// * 2. ��� ��
		// �޴��� : ����\n
		// * �޴��� �ִ� 3�� 
		// ���̻� ����� �� �����ϴ�.
		// * 0. ���� �Է� �� ���α׷� ����
		Scanner input = new Scanner(System.in);
		int select;
		int menuNum = 0;
		String menuName;
		int menuPrice;
		String[] listMenuName = new String[3];
		int[] listMenuPrice = new int[3];
		
		while (true) {
			System.out.println("�޴��� �����Ͻÿ�");
			System.out.println("1. �޴����, 2. ���, 0. ����");
			System.out.print("��ȣ : ");
			select = input.nextInt();
			input.nextLine();
			if (select == 0) {
				System.out.println("(���α׷� ����)");
				break;
			}
			switch (select) {
				case 1 : 
					if (menuNum >= 3) {
						System.out.println("���̻� ����� �� �����ϴ�.");
						System.out.println();
						break;
					}
					System.out.println("����� �޴��� �Է��ϼ���");
					System.out.print("�޴��� : ");
					menuName = input.nextLine();
					System.out.println("������ ����� �ּ���");
					System.out.print("���� : ");
					menuPrice = input.nextInt();

					listMenuName[menuNum] = menuName;
					listMenuPrice[menuNum] = menuPrice;
					menuNum++;
					System.out.println();
					break;
				case 2 : 
					if (menuNum == 0) {
						System.out.println("�޴��� �ԷµǾ� ���� �ʽ��ϴ�.");
						System.out.println();
						break;
					}
					for (int i = 0 ;i < menuNum; i++) {
						System.out.println(listMenuName[i] + " : " + listMenuPrice[i]);
					}
					System.out.println();				
					break;
				default :
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��� �ּ���.");
					System.out.println();
			} 
		}
	}
}