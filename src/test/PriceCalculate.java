package test;

public class PriceCalculate {

	public static void main(String[] args) {

		Customer cus1 = new Customer(23,"Female",false,true, false, true);
		int prc1 = getPrice(cus1);
		System.out.println("あなたの映画料金は" + prc1 + "円です");

		Customer cus2 = new Customer(5,"Male",true, false,false, false);
		int prc2 = getPrice(cus2);
		System.out.println("あなたの映画料金は" + prc2 + "円です");

		Customer cus3 = new Customer(18 ,"Male",true , true, false, true);
		int prc3 = getPrice(cus3);
		System.out.println("あなたの映画料金は" + prc3 + "円です");

		Customer cus4 = new Customer(23 ,"Male",false , true, false, false);
		int prc4 = getPrice(cus4);
		System.out.println("あなたの映画料金は" + prc4 + "円です");

		Customer cus5 = new Customer(15,"Female", true, true, true, false);
		int prc5 = getPrice(cus5);
		System.out.println("あなたの映画料金は" + prc5 + "円です");

		Customer cus6 = new Customer(9,"Female", false, true, true, false);
		int prc6 = getPrice(cus6);
		System.out.println("あなたの映画料金は" + prc6 + "円です");

		Customer cus7 = new Customer(30,"Female", false, true, true, true);
		int prc7 = getPrice(cus7);
		System.out.println("あなたの映画料金は" + prc7 + "円です");

		Customer cus8 = new Customer(30,"Male", false, true, false, true);
        int prc8 = getPrice(cus8);
        System.out.println("あなたの映画料金は" + prc8 + "円です。");


        Customer cus9 = new Customer(-2,"Male", false, true, false, true);
        int prc9 = getPrice(cus9);
        System.out.println("あなたの映画料金は" + prc9 + "円です。");


	}



        public static int getPrice(Customer cus){
        	  int price = 0;
        	  int age = cus.getAge();
        	  String gender = cus.getGender();
        	  boolean ifFirstday = cus.getifFirstday();
        	  boolean ifWednesday = cus.getifWednesday();
        	  boolean ifMidnight = cus.getifMidnight();
        	  boolean if3D = cus.getif3D();


	    	  if(age >= 0 && age < 6){
	    		  price = 0;
	    	  }else if((age >= 6 && age < 15) || ifFirstday == true){
	    		  price = 1000;
	    	  }else if(age >= 15 && age < 18 || (ifWednesday == true && gender.equals("Female"))){
	    		  price = 1200;
	    	  }else if(age >= 18 && age < 22 || ifMidnight == true){
	    		  price = 1500;
	    	  }else if(age >= 22){
	    		  price = 1800;
	    	  }else{
	    		  System.out.println("入力エラーです。年齢を正確に入力してください。");
	    	  }

	    	  if(age >= 0 && if3D == true){
	    		  price = price + 400;
	    	  }
	    	  return price;

	      }


	}

