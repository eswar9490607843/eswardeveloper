package work_10_05;

public class Double_Catch_Example {
	public static void main(String[] args) {
		
	int name[]= {2,3,4,5,6};
   try {
	   int a=50%0;
	   name[5]=40/0;
   }
   catch(ArrayIndexOutOfBoundsException e ) {
	   System.out.println("djd");
   }
   catch(Exception e){
		  System.out.println("code handled"); 
  
  }
}
}