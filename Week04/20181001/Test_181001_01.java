public class Test_181001_01 {
	public static void main(String[] args) {
		System.out.println("�迭 ������ ���� ������Ű��");
		// ���� : int�� ���� 100��¥�� �迭�� �����ϰ� �� ������ ���� �ʱ�ȭ�� ��,
		// �ݺ����� �̿��Ͽ� �� ������ ���� 1�� ������Ų��.
		// ������ :
		// �ʱⰪ : 9 7 6 4 5 4 0 1 3 2 
		// ������ : 10 8 7 5 6 5 1 2 4 3

/*		int[] arr = new int[10];
		arr[0] = 9;
		arr[1] = 7;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 4;
		arr[6] = 0;
		arr[7] = 1;
		arr[8] = 3;
		arr[9] = 2;
*/
		int arr[] = {9, 7, 6, 4, 5, 4, 0, 1, 3, 2};
		int i;
		System.out.print("�ʱⰪ : ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
		for (i = 0; i < arr.length;i++) {
			arr[i]++;
		} 
		System.out.print("������ : ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
	}
}