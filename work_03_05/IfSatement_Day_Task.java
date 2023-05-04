package work_03_05;

import java.util.Scanner;

public class IfSatement_Day_Task {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the which day you want to know");
      String day=sc.nextLine();
      if (day=="saturday"||day=="sunday") {
		System.out.println(day+"is the weakend day");
	}else
		System.out.println("this is the weekday");
	}

}
