package work_03_05;

public class EvenOrNot_Checking_Arguement {

	public static void main(String[] args) {
		EvenOrNot_Checking_Arguement check=new EvenOrNot_Checking_Arguement();
boolean	result=	check.isEven(4);
System.out.println(result);
	}
  public boolean isEven(int num) {
	 
	  if (num%2==0) {
			return true;
		} 
	  else {
		  return false;
	  }
  }
}
