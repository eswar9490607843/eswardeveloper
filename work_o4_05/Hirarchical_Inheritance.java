package work_o4_05;

public class Hirarchical_Inheritance {

	public static void main(String[] args) {
		Withdrawl d1=new Withdrawl();
	    d1.details();
	    d1.depamt();
	    d1.withamt();
	  }
	}


class Bank
{
   String Accname="eswar";
   int acno=89898989;
   public void details()
   {
      System.out.println("Acc name:"+Accname);
   }
}
class Deposit extends Bank
{
   double bal=100;
   public void depamt()
   {
      System.out.println("Deposit amt : "+bal);
   }
}
class Withdrawl extends Deposit
{
   double amt=200;
   public void withamt()
  {
    
}}

