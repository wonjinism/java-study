// ���� ��
// ���� �հ� ��
// �� ��°���� üũ

class FiftiethSumNum {
	public static void main(String[] args) {
		int output = 1;
		int check;
		for (int i = 2; i <= 50; i++) {
			check = i % 2;
			if ( check == 0 ) {
				output += i;
			} else {
				output -= i;
			}
		}
		System.out.println(output);
	}
}