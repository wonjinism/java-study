public class ArrayTest_180928_03 {
	public static void main(String[] args) {
	// ���� : �����ڵ� 41 - 122������ �ڵ�� ���ڸ� �� �ٿ� 8���� ����Ѵ�.
	// char ���� �������̴�. ���� ��� ���� 'A'�� �����ڵ尪�� 65(10������ ���)�� ����ȴ�.
	// ������ : 
	// 41:)		42:*	43:+	44:,	45:=	45:
		int count = 0;
		for (int i = 41; i <=122; i++) {
			if (i < 100) {
				System.out.print(" ");
			}
			System.out.print(i + ":" + (char)i + "\t");
			count++;
			if (count % 8 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
