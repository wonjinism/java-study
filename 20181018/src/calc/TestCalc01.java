package calc;

public class TestCalc01 {
	public static void main(String[] args) {
		// main�ż��忡�� ���� ȣ���ϰ� ���� ����� return �޾� main �ż��忡�� ���
		// ȣ���Լ� : sum(3,5) sub(7,2) mul(4,5) div(7,3) -> ���ڴ� ����
		// ������ :
		// ���ϱ� : 8
		// ���� : 5
		// ���ϱ� : 20
		// ������ : 2.3333333

		Calculation calc = new Calculation();
		int result_sum = calc.sum(3, 5);
		int result_sub = calc.sub(7, 2);
		int result_mul = calc.mul(4, 5);
		double result_div = calc.div(7, 3);

		System.out.println("���ϱ� : " + calc.sum(3, 5));
		System.out.println("���� : " + calc.sub(7, 2));
		System.out.println("���ϱ� : " + calc.mul(4, 5));
		System.out.println("������ : " + calc.div(7, 3));

		Calculation calc2 = new Calculation(10, 20);
		System.out.println("���ϱ� : " + calc2.sum2(calc2));
		System.out.println("���� : " + calc2.sub2(calc2));
		System.out.println("���ϱ� : " + calc2.mul2(calc2));
		System.out.println("������ : " + calc2.div2(calc2));
	}
}