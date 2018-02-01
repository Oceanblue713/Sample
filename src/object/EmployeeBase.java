package object;

/**
 * @author andy
 *
 */
public class EmployeeBase {
	public int employeeId;
	public String employeeName;
	public String divisionName;
	public int vitality;

	EmployeeBase(){

	}

	EmployeeBase(int employeeId, String employeeName, String divisionName, int vitality){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}

	void introduce(){
		vitality = vitality - 10;
		System.out.println("私の名前は" + employeeName + "です");
		System.out.println("所属部署は" + divisionName + "です");
	}

	void greeting(){
		vitality = vitality - 10;
		System.out.println("おはようございます");
	}

	void greeting(String divisionName){
		vitality = vitality - 10;
		System.out.println(divisionName + "の皆さん、おはようございます");
	}

	void showVitality(){
		vitality = vitality - 10;
		System.out.println("残りの体力は" + vitality);
	}

}
