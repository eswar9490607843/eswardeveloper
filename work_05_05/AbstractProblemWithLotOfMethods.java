package work_05_05;

public class AbstractProblemWithLotOfMethods {

	public static void main(String[] args) {

	}

}
abstract class Pen{
	public abstract void write();
	public abstract void refill();
}
class Concrete implements Pen{
	public void pen() {
		System.out.println("this is pen method");
	}
	public void refill() {
		System.out.println("refill method ");
	}
	public void nib() {

	}
}
interface Tvremote implements SmartTvremote{

}
