public class RelationalOp {
	public static void main(String[] args) {
		RelationalOp op1 = new RelationalOp(); 
		RelationalOp op2 = new RelationalOp();
		RelationalOp op3 = op1;
		RelationalOp op4 = op3;
	
		System.out.println("op1�� op2�� ���� : " + (op1 == op2));
		System.out.println("op1�� op4�� ���� : " + (op1 == op4));
		System.out.println("op2�� op3�� ���� : " + (op2 == op3));
	}

}