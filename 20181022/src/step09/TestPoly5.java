package step09;

public class TestPoly5 {
	public static void main(String[] args) {
		Employee e = new Employee("K1", "구하연", 200);
		Manager m = new Manager("K2", "장보영", 300, "영업부");
		Engineer en = new Engineer("K3", "이대건", 400, "자바");
		HrMgr mgr = new HrMgr();
		
		System.out.println(m instanceof Employee);
		
		mgr.printAnnualSalary(e);
		mgr.printAnnualSalary(m);
		mgr.printAnnualSalary(en);
	}
}