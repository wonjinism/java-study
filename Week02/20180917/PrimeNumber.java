//for�� �̿��� �Ҽ��� ����ϼ��� (1~100����)

public class PrimeNumber
{
	//1�� �ڱ� �ڽ� �̿ܿ� ���̻� ���� �� ���� ���� ���
	//1�� �� �������� ������ 2���� �ڱ��ڽű��� ���ڸ� 1���� ���ϸ鼭 ������ �������� ��찡 1���� �ִ� ��� 
	public static void main(String[] args){
		System.out.println("1");
		for ( int i = 1; i <= 1000; i++ ){
			int count = 0;
			for ( int j = 2; j <= i; j++ ){ 
				int nameoji = i % j;
				if ( nameoji == 0 ){
					count++;
				}
			}
			if ( count == 1 ){
				System.out.println(i);
			}
		}
	}
}

// ��� �Ǵ� �Ҽ� / �ڱ� �ڽ��� �����ϰ� 2, 3, 5, 7