/* public�� ���� ������, class�� �����. 
�̹� �ִ� �Լ����� �������� ���̴� �̹� ������� ����. �׷� �̸��� �Ȱ��� �̸����δ� �������� ���� �� ����
HelloJava�� Ŭ������ �̸�.
String�� ���ڿ��� ���� �� �ִ� ��ü. �ڷ����� ��ü�� �ٸ�. ���Ŀ� ���� ��.
*/ 

public class HelloJava { 
	String sayHello = "�ȳ��ϼ���";
	String name = "������";
	int age;

	public HelloJava(int newAge) { 
		age = newAge;
	}
/* Ŭ������ ������ ������ �Ϸ��� Ŭ���� �̸��� ��ҹ��ڱ��� ��ġ�ؾ� ��. 
newAge�� ������ �ȿ����� ������ ���̱� ������ �޽���� newAge�� �ٸ���.
*/
	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public static void main(String[] args) {
		new HelloJava(28);
	}
}
