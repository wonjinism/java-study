public class BreakTest
{
	public static void main(String[] args){
		for ( int i = 1; i <= 100; i++){
			System.out.println("i = " + i);
			if ( i == 50 ) break;
		}
	
 
		System.out.println();
		for ( int i = 1; i <= 100; i++){
			if ( i == 50 ) {
				break; // ���� 50�� ��� ���� for���� break�� ��������.
			}
			System.out.println("i = " + i);
		}
	
	
		System.out.println();	
		for ( int i = 1; i <= 100; i++){
			if ( i == 50 ) {
				continue; // ���� 50�� ��� ���� for���� break�� ��������.
			}
			System.out.println("i = " + i);
		}
	}

}