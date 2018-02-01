package test;

public class SetterGetterSample {

	public static void main(String[] args) {

		EmployeeVo ev = new EmployeeVo();
		ev.setEmployeeName("大島");
		String ename = ev.getEmployeeName();
		System.out.println(ename);

	}

}
