import java.util.Scanner;
class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.print("Java ���� : ");
			int java = input.nextInt();
			if ( java > 100 || java < 0 ){
				System.out.println("�߸� �Է��߽��ϴ�.");
				break;
			}
			System.out.print("Oracle ���� : ");
			int oracle = input.nextInt();
			if ( oracle > 100 || oracle < 0 ){
				System.out.println("�߸� �Է��߽��ϴ�.");
				break;
			}
			System.out.print("JSP ���� : ");
			int jsp = input.nextInt();
			if ( jsp > 100 || jsp < 0 ){
				System.out.println("�߸� �Է��߽��ϴ�.");
				break;
			}
			int total = java + oracle + jsp;
			double average = (double)total / 3;
			if ( average >= 90 ) {
				System.out.println("���� : " + total + " ��� : " + average + " ��� : " + "��");
			} else if ( average >= 80) {
				System.out.println("���� : " + total + " ��� : " + average + " ��� : " + "��");				
			} else if ( average >= 70) {
				System.out.println("���� : " + total + " ��� : " + average + " ��� : " + "��");
			} else if ( average >= 60) {
				System.out.println("���� : " + total + " ��� : " + average + " ��� : " + "��");
			} else if ( average < 60) {
				System.out.println("���� : " + total + " ��� : " + average + " ��� : " + "��");
			}
			break;
		}
	}
}