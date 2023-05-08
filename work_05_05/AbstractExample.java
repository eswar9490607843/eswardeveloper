package work_05_05;

public class AbstractExample {

	public static void main(String[] args) {
     Bank b1=new Bank1();
     b1.getBalance();
     Bank2 b2=new Bank2();
     b2.getBalance();
     Bank3 b3=new Bank3();
     b3.getBalance();
	}

}
abstract class Bank{
	 abstract void getBalance(); 
	
}class Bank1 extends Bank{
	int deposited=100;
	public void getBalance() {
		System.out.println(deposited);
	}
}class Bank2 extends Bank{
	int deposited=150;
	public void getBalance() {
		System.out.println(deposited);
	}
}class Bank3 extends Bank{
	int deposited=200;
	public void getBalance() {
		System.out.println(deposited);
	}
}
