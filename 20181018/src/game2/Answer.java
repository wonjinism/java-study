package game2;

public class Answer {

	public String Measure(int x, int a) {
		
		int count = 0;
		
		if (x > a) {
			System.out.println("ũ��");
			count += 1;
			return "A";
		} else if (x < a) {
			System.out.println("�۴�");
			count += 1;
			return "B";			

		} else {
			System.out.println("�¾Ҵ�(" + count + "��)");			
			return "C";			
		}
	}
}
