package object;

public class EmployeeTest01 {

	public static void main(String[] args) {

		AbstractEmployee emp01;
		AbstractEmployee emp02;

		emp01 = new EmployeeGeneral();
		emp02 = new EmployeeSystem();


		emp01.greeting();
		emp02.greeting();


	}

}
