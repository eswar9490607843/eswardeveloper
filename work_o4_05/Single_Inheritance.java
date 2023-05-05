package work_o4_05;

public class Single_Inheritance {

	public static void main(String[] args) {
       car c=new car();
       c.i20();
       engine e=new engine();
       e.moto();
       e.i20();  
	}

}

 class car{
	 public void i20(){
		 System.out.println("this is i20 car");
	 }
 }
 class engine extends car{
	 public void moto() {
		System.out.println("this is the i20 engine"); 
	 }
 }
