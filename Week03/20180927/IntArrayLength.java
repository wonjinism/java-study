public class IntArrayLength {
	public static void main(String[] args) {
		int[]  intArr = new int[5];
		intArr[0] = 11;
		intArr[1] = 22;
		intArr[2] = 33;
		System.out.println("�迭�� ���̴� " + intArr.length);

		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}