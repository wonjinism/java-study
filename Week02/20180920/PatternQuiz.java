// 3�� ����� a
// 5�� ����� b
// 7�� ����� c
// ������� �ٿ��ְ� �� �ٲ�.

class PatternQuiz {
	public static void main(String[] args) {
		int i = 1;
		while ( i <= 50) {
			System.out.print(i);
			int a = i % 3;
			int b = i % 5;
			int c = i % 7;
			
			if ( a == 0 ) {
				System.out.print("^a");
			}
			if ( b == 0 ) {
				System.out.print("^b");
			}
			if ( c == 0 ) {
				System.out.print("^c");
			}
			System.out.println();
			i++;
		}
	}
}