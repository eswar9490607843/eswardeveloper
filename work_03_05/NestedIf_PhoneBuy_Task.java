package work_03_05;

import java.util.Scanner;

public class NestedIf_PhoneBuy_Task {

	public static void main(String[] args) {
		int iphone_cost=50000,redmi_cost=25000,nokia_cost=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the how much money you have");
		int my_money=sc.nextInt();

		if (my_money>nokia_cost) {
			

			if (my_money>redmi_cost) {

				if (my_money>=iphone_cost) {
					System.out.println("buying the i phone mobile");
					
				}
				System.out.println("buying the redmi mobile");

			}
			System.out.println("buying the i nokia mobile");
		}
		else
			System.out.println("retun to home");
	}

}
