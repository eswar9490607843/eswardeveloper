package work_10_05;

public class Double_Catch_SecondCatch_ExceptionName {

	public static void main(String[] args) {
      String name="eswar";
      try {
    	  name.charAt(5);
    	  name.compareTo(name);
      }catch(ArithmeticException e){
    	System.out.println("first catch block no problem for arithmeticException");  
      }catch(Exception) {
    	  System.out.println("second catch block cannot take Exception ");
      }
	}

}
