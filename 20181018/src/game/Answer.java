package game;

public class Answer {

	int count = 0;
	
	public String Measure(int x, int a) {
	
		if (x < a) {
			System.out.println("ũ��");
			count += 1;
			return "A";
		} else if (x > a) {
			System.out.println("�۴�");
			count += 1;
			return "B";			
		} else {
			count += 1;
			System.out.println("�¾Ҵ�(" + count + "��)");	
			return "C";			
		}
	}
}
