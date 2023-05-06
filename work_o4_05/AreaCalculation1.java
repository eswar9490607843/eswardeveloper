package work_o4_05;

import java.util.Scanner;

public class AreaCalculation1 {

	public static void main(String[] args) {
		Area1 a=new Area1();
		a.setDim();
		a.getArea();
}}class Area1{

		public void setDim() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the radious of circle");
			float radi=sc.nextFloat();
			float pia=6;
			System.out.println(radi*pia);
		}
		public void getArea() {
			Scanner s=new Scanner(System.in);
			System.out.println("entr the value of rectangle");
			int lenght=s.nextInt();
			int breadth=s.nextInt();
			System.out.println(lenght*breadth);

		}
	}
