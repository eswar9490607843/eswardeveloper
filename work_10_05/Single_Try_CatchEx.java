package work_10_05;

public class Single_Try_CatchEx {

	public static void main(String[] args) {
		
		     try {
		    	 int s=50%0;
		     }
		     catch(ArithmeticException k) {
		    	 System.out.println(k);
		     }
		     System.out.println("rest of the code");
			}
	}


