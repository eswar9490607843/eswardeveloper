package work_05_05;

public class AbstractExample1 {

	public static void main(String[] args) {
       Cats c=new Cats();
       c.cats();
       Dogs d=new Dogs();
       d.dogs();
       
	}
}
abstract class Animal{
	abstract void cats();
	abstract void dogs();
}
 class Cats extends Animal{
	public void cats() {
		System.out.println("Cats meow");
	}
	@Override
	void dogs() {	
	}
}
class  Dogs extends Animal{
	public void dogs() {
		System.out.println("Dogs bark");
	}
	void cats() {	
	}
}
