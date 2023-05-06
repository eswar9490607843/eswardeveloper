package work_o4_05;

public class AreaFinding_Different_Shape {

	public static void main(String[] args) {
       Shape2 s=new Shape2();
       s.shapeMetode();
       s.shapeMetode();
	}
}
class Shape2{
	public void shapeMetode() {
		System.out.println("this is shape");
	}
}
class Rectangle1 extends Shape2{
	public void  shapeMetode() {
		System.out.println("this is therectangular shape");
	}
}
class Circle1 extends Shape2{
	public void shapeMetode() {
		System.out.println("this is the circular shape");
	}
}