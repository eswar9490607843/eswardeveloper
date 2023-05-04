package work_03_05;

public class OutPut_Checking_NestedIfElse {

	public static void main(String[] args) {
      int age=25;
      if(age>0) {
    	  if (age>16) {
			System.out.println("welcome");
		}
    	  else {
    		  System.out.println("too young");
    	  }
      }
      else {
    	  System.out.println("error");
      }
	}

}
