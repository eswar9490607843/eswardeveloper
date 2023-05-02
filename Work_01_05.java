package org.druclasses;

public class Work_01_05 {

	public static void main(String[] args) {
     System.out.println("my name is gedela eswara rao");
     NameAndId n=new NameAndId();
     n.entering();
     Addition a1=new Addition();
     a1.adding();
     CollegeName c1=new CollegeName();
     c1.nameOfCollege();
     Hello h1=new Hello();
     h1.technic();
     DivisionTask d1=new DivisionTask();
     d1.getAnswer();
     AdditionTask a2=new AdditionTask();
     a2.add();
	}

}
class NameAndId{
  public void entering()  {
	   	System.out.println("my name is :eswar");
	   	System.out.println("my id : 19-106");
	}
}
class Addition{
	public void adding() {
		int a=5,b=3,c;
		c=a+b;
		System.out.println(c);
		
	}
}
class CollegeName{
	public void nameOfCollege() {
		System.out.println("VISVODAYA ENGINEERING COLLEGE KAVALI");
	}
}
class Hello{
	public void technic() {
		System.out.println("hello"+" "+"123");
	}
}
class DivisionTask{
	public void getAnswer() {
		int a=10,b=2,c;
		c=a/b;
		System.out.println(c);
	}
}
class AdditionTask{
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
}

