class sumOfOneToHundred 
{
	int sum; // Ŭ���� ���� ������ int // �������� ����

	public sumOfOneToHundred(){ // ������		
	}

/*	public int getSum() {
		return sum;
	}
*/
	public static void main(String[] args) 
	{
		sumOfOneToHundred test = new sumOfOneToHundred(); // test��� �̸����� ��ü ����
//		int sum = test.getSum(); // �������� ����
		System.out.println(test.sum); 


		for (int i = 1; i <= 100; i++){
			if ( i % 2 != 0){
				test.sum = test.sum + i;
			}	
		}
		System.out.println(test.sum);
	}
}