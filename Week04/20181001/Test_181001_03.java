import java.util.Random;
public class Test_181001_03 {
	public static void main(String[] args) {
		System.out.println("�������� ���ڿ� 10�� ����ϱ�");
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print((char)(r.nextInt(26) + 65));
			System.out.print(i < 9 ? " " : "\n");
		}
	}
}