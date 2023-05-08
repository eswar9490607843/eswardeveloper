package work_05_05;

public class B implements A {
    public void m1() {
    	System.out.println("one");
    }
}
interface A{
	 A(){   //here interface does not contain body and return type also not writtern 
		 
	 }
	void m1();
}
