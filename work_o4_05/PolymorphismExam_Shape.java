package work_o4_05;

class Shape{
	public void methodOfShape() {
		System.out.println("this is the shape");
	}

	public void circleNature() {
		
	}

	public void rectangleNature() {
		
	}
}
class Circle extends Shape{
	public void circleNature() {
		System.out.println("this is the circle shape");
	}
}
class Rectangle extends Shape{
	public void rectangleNature() {
		System.out.println("this is the rectangle shape");
	}
}

public class PolymorphismExam_Shape {

	public static void main(String[] args) {
		Shape s;
		s=new Circle();
		s.circleNature();
		s=new Rectangle();
		s.rectangleNature();
	}

}
