package work_o4_05;

public class AreaFinding_ByOverLoading {

	public static void main(String[] args) {
     Shape1 s=new Shape1();
     s.draw(3);
     s.draw(15, 25);
	}

}
class Shape1{
	public void draw(int lenght,int breadth) {
		 lenght=20;
		 breadth=30;
		System.out.println("rectangle lenght of "+lenght*breadth);
	}
	public void draw(float radious) {
		radious=2;
	    float areaofcircle=6*radious;
	    System.out.println("area of circle"+areaofcircle);
	}
}
