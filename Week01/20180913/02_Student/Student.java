class 02_Student 
{
	int age = 0;
	String name = "";
	public Student(String setName) {
		name = setName;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) 
	{
		Student st = new Student("�����");
		System.out.println(st.getName());
	}
}
