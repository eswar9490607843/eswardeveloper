package work_05_05;

public class FindingError1 implements A {
   void m1() {   // method should be public
    	System.out.println("one");
    }
}
interface A{
	void m1();
}