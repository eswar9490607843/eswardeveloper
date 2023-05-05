package work_o4_05;

public class Food 
{
	public static void main(String[] args)
	{
		Food  r=new Food();
		r.chicken();
		r.wheat();
	    r.cooking();
		System.out.println(food2);  

	}
	public String food1="basmatirice"; 

	public static String food2="biryani";  

	public void cooking() {
		System.out.println("rice is on cooking");

		System.out.println("food 1 is:"+food1);

		System.out.println(food2);

	}	
	public void wheat() {
		int cost=70;
		String colour="brown";
		String type="poor";
//		System.out.println(cost);

	}
	public void chicken() {
		int cost=200;
		String colour="red";
		String type="good";
		
	}

}
