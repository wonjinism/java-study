class VarChange
{
	public static void main(String[] args){
	int x = 100;
	int y = 200;
	int temp;
	System.out.println("��ȯ �� : x=" + x + ", y=" + y);

	temp = x;
	x = y;
	y = temp;
	System.out.println("��ȯ �� : x=" + x + ", y=" + y);
	}
}