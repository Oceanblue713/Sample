package test;

public class ObjectSample05 {

	public static void main(String[] args) {

		String divisionName = "総務部";
		Employee emp01 = new Employee("櫛引",divisionName,200);
		emp01.greeting();
		emp01.greeting(divisionName);
		emp01.showVitality();


	}

}
