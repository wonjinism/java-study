public class Homework_180928_01 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 8, 13, 17, 20};
		int minDistance = 0;
		String result = null;
		// �ݺ��� i�� �ݺ��� j�� �ٸ� �迭 �ڸ� �ֵ�� ��
		// ���� minDistance ���ں��� ���� ��쿡 �� ���ڸ� result�� ����Ѵ�.
		int distance = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++ ) {
				distance = arr[i] - arr[j];
				if (distance < 0) {
					distance *= -1;
				}
				if (minDistance == 0){ // minDistance�� �ϴ� ������Ʈ
					minDistance = distance;
					result = arr[i] + ", " + arr[j];
				} else if (distance < minDistance) { // ���ؼ� ������Ʈ
					minDistance = distance;
					result = arr[i] + ", " + arr[j];
				}
			}
		}
		System.out.println(result);
	}
}