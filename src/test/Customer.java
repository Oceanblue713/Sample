package test;

class Customer {
      private int age;
      private String gender;
      private boolean ifFirstday;
      private boolean ifWednesday;
      private boolean ifMidnight;
      private boolean if3D;


      Customer(){
      }

      Customer(int age, String gender,boolean ifFirstday, boolean ifWednesday, boolean ifMidnight, boolean if3D){
    	  this.age = age;
    	  this.gender = gender;
    	  this.ifFirstday = ifFirstday;
    	  this.ifWednesday = ifWednesday;
    	  this.ifMidnight = ifMidnight;
    	  this.if3D = if3D;
      }

      public int getAge(){
    	  return age;
      }

      public void setAge(int age){
    	  this.age = age;
      }

      public String getGender(){
    	  return gender;
      }

      public void setGender(String gender){
    	  this.gender = gender;
      }


      public boolean getifFirstday(){
    	  return ifFirstday;
      }

      public void setifFirstday(boolean ifFirstday){
    	  this.ifFirstday = ifFirstday;
      }

      public boolean getifWednesday(){
    	  return ifWednesday;
      }

      public void setifWednesday(boolean ifWednesday){
    	  this.ifWednesday = ifWednesday;
      }

      public boolean getifMidnight(){
    	  return ifMidnight;
      }

      public void setifMidnight(boolean ifMidnight){
    	  this.ifMidnight = ifMidnight;
      }

      public boolean getif3D(){
    	  return if3D;
      }

      public void setif3D(boolean if3D){
    	  this.if3D = if3D;
      }
}

