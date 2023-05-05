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
		b=new Icici();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new Pnb();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}  
}

class BestBank{  
	float getRateOfInterest(){
		return 0;
	}  
}  
class Sbi extends BestBank{  
	float getRateOfInterest(){return 8.4f;}  
}  
class Icici extends BestBank{  
	float getRateOfInterest(){return 7.3f;}  
}  
class Pnb extends BestBank{  
	float getRateOfInterest(){return 9.7f;}  
}  
