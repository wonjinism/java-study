public class ArrayTest_180928_02 {
	public static void main(String[] args) {
		System.out.println("4�� ����̸鼭 5�� ����� �ƴ� �� ã��");
		/* ���� : 100 ������ �ڿ��� �߿��� 4�� ����̸鼭
				5�� ����� �ƴ� ���� ��� ����Ͻÿ� 
			������ : */
		for (int i = 1; i <=100; i++) {
			if ( i % 5 != 0 && i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}