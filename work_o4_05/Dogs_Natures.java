package work_o4_05;


 class Dog{
	 
	 String color;
	 int age;
	 float cost;
 
		 public Dog()   //default constructor 
		 {
			 this.color="black";
			 this.age=6;
			 this.cost=10000;
			 
		 }
		 
		 public Dog(String color,int age,float cost )  //parameterised constructor 
		 {
			 this.color=color;
			 this.age=age;
			 this.cost=cost;
					 
		 }
	
}
 public class Dogs_Natures {

		public static void main(String[] args) {
	   
			Dog husky = new Dog();
   		husky.color="grey";

			
			System.out.println(husky.color+" "+husky.age+" "+husky.cost);
			
			Dog domolite = new Dog();
			domolite.age=7;
			
			System.out.println(domolite.color+" "+domolite.age+" "+domolite.cost);
			
			Dog bulldog = new Dog();
			System.out.println(bulldog.color+" "+bulldog.age+" "+bulldog.cost);
			
			
			Dog doberman = new Dog("Goldernbrown",9,8000);
			
			System.out.println("---");
			System.out.println(doberman.color+" "+doberman.age+" "+doberman.cost);
			
		}

	}
