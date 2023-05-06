package work_o4_05;

import work_o4_05.*;
import work_o4_05.*;
import work_o4_05.*;
import work_o4_05.*;

public class Rbi_IntrestPaying {

	public static void main(String[] args) {
		BestBank b;  
		b=new Sbi();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
		System.out.println("SBI minimumWithDrawal: "+b.minimumWithDrawal()); 
		System.out.println("SBI minimumBalancet: "+b.minimumBalance()); 
		b=new Icici();  
		System.out.println("icici Rate of Interest: "+b.getRateOfInterest());
		System.out.println("icici minimumWithDrawal: "+b.minimumWithDrawal()); 
		System.out.println("icici minimumBalancet: "+b.minimumBalance());
		
		b=new Pnb();  
		System.out.println("pnb Rate of Interest: "+b.getRateOfInterest());
		System.out.println("pnb minimumWithDrawal: "+b.minimumWithDrawal()); 
		System.out.println("pnb minimumBalancet: "+b.minimumBalance());  
	}  
}

class BestBank{  
	float getRateOfInterest(){
		return 0;
		}  
	float minimumWithDrawal() {
		return 0;
	}
	float minimumBalance() {
		return 0;
	}
}  
class Sbi extends BestBank{  
	float getRateOfInterest(){return 8.4f;} 
	float minimumWithDrawal() {return 100;}
	float minimumBalance() {return 1000 ;}
}  
class Icici extends BestBank{  
	float getRateOfInterest(){return 7.3f;} 
	float minimumWithDrawal() {return 100;}
	float minimumBalance() {return 2000 ;}
}  
class Pnb extends BestBank{  
	float getRateOfInterest(){return 9.7f;}
	float minimumWithDrawal() {return 100;}
	float minimumBalance() {return 5000 ;}
}  
