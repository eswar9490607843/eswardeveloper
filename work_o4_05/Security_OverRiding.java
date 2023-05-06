package work_o4_05;

public class Security_OverRiding {

	public static void main(String[] args) {
     Outer o=new Outer();
     o.behaviour();
     Manager m=new Manager();
     m.behaviour();
	}

}
class Outer{
	public void behaviour() {
		System.out.println("security asking who are you");
	}
}
class Manager extends Outer{
	public void behaviour() {
		System.out.println("security saying good morning sir");
	}
}
