public class Test01 {
	public static void main(String[] args) {		
		// ������ ���� �߻��ϴ� ǥ���� ã��
		boolean a = true & true;
		int b = 4 & 5;
//		int c = 0 > 3; 
//		float d = 40.0; // �Ҽ��� ��� f�� ĳ���� ���־�� �Ѵ�.
//		boolean e = (boolean) 1; // int�� boolean���� ������ �� ����.

		// float�� �ùٸ� ���� ã��
		// f�� ���� : �Ҽ����� �Է��ϸ� �⺻������ double�� �ν��ϱ� ������ float�� ���� f�� �ڿ� �ٿ��� ĳ�������ִ� ����
		float foo1 = -1;
//		float foo2 = 1.0; // f�� ���
//		float foo3 = 42el; // 42e �ڿ� l�� �ٿ��� Ʋ��
		float foo4 = 2.02f;
//		float foo5 = 3.03d; // f ��� d�� �پ
		float foo6 = 0x0123; // 16����

		// ������ �߻��ϴ� ǥ����
		char cha1 = '\n'; // ����
//		char cha2 = "\0";
		char cha3 = '\r'; // ĳ���� ���� (��������� ����)
//		char cha4 = '\c';

		// ������ �� ������ �߻��ϴ� ��
		float fl1 = 1;
		float fl2 = 1L; // ������ ���� int�� �ν��ϱ� ������ ���� l�� �ٿ��� long Ÿ������ ĳ�������ִ� ���� // float�� longŸ�� ���� ũ�� ������ ����?
		float fl3 = 1.0f;
//		float fl4 = 1.0; // �Ҽ��ε� f�� ���� �ʾƼ�
	}
}