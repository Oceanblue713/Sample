package test;

public class Employee {
         public String employeeName;
         public String divisionName;
         public int vitality;

         Employee(){

         }

         Employee(String employeeName, String divisionName, int vitality){
        	 System.out.println("初期化時に引数ありコントラクタが呼ばれました");
        	 this.employeeName = employeeName;
        	 this.divisionName = divisionName;
        	 this.vitality = vitality;
         }

         public void introduce() {
        	 vitality = vitality - 10;
        	 System.out.println("私の名前は" + employeeName + "です");
        	 System.out.println("所属部署は" + divisionName +"です");
         }
         public void greeting(){
        	 vitality = vitality - 10;
        	 System.out.println("おはようございます");
         }

         public void greeting(String divisionName) {
        	 vitality = vitality - 10;
        	 System.out.println(divisionName + "の皆さん、おはようございます");
         }



         public void report(){
        	 vitality = vitality - 10;
        	 System.out.println("今日は10件アポイントをとりました");
         }

         public void showVitality(){
        	 vitality = vitality - 10;
        	 System.out.println("残り体力は" + vitality);
         }

         public void attendance(){

         }
         public void leaveWork(){

         }



}
