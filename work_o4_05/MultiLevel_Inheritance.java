package work_o4_05;

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		GrandFather g=new GrandFather();
		g.grandBehaviour();
		Father f=new Father();
		f.fatherBehaviour();
		f.grandBehaviour();
		Son s=new Son();
		s.sonBehaviour();
		s.fatherBehaviour();
	}

}
class GrandFather{
	String s="sleeping";
	public void grandBehaviour() {
		
		System.out.println(s);
	}
}
class Father extends GrandFather {
	public void fatherBehaviour() {
		System.out.println(s);
	}
}
class Son extends Father{
	public void sonBehaviour() {
		System.out.println(s);
	}
}