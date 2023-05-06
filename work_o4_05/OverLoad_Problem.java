package work_o4_05;

public class OverLoad_Problem {
	public void sum(double d,double e){  //Square shape area 
		System.out.println(d*e);
		}
	public void sum(float a,float b){  //rectangle shape area
		  System.out.println(a*b);
		  }

	public static void main(String[] args) {
		OverLoad_Problem obj=new OverLoad_Problem();
		obj.sum(20,20);
		  obj.sum(15.3,20.5);
	}

}
