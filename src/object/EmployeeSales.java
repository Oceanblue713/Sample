package object;


/**
 * @author andy
 *
 */
public class EmployeeSales extends EmployeeBase{

	public String apointment;

	EmployeeSales(){

	}

	EmployeeSales(int employeeId, String employeeName, int vitality){
		super.employeeId = employeeId;
		super.employeeName = employeeName;
		super.divisionName = divisionName;
		super.vitality = vitality;
		this.apointment = "未定";
	}

	void report(){
		vitality = vitality - 10;
		System.out.println("今日は10件アポイントとりました");
	}

	@Override

	void introduce() {
		vitality = vitality - 10;
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName +"です。");
		System.out.println("今日のアポイント先は" + apointment + "です。");
	}

    @Override
	void greeting(){
		vitality = vitality -10;
		System.out.println(super.divisionName + "の皆さん" +"おはようございます" );
	}

}

