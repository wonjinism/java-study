public class Test_181002_01 {
	public static void main(String[] args) {
		System.out.println("�迭 ���� 1");
		// int�� �迭�� 10�� �����ؼ� �� ������ ���� 2��+1�� ���� �� ����ϼ���.
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = arr[i] * 2 + 1;
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
	}
}