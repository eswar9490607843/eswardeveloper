package work_11_05;

import work_11_05.*;
import work_11_05.*;
import work_11_05.*;

public class MultiThreading_ThreadClass {

	public static void main(String[] args) {
     Eswar e1=new Eswar();
     Ravi r1=new Ravi();
     Vinay v1=new Vinay();
     v1.start();
     r1.start();
     e1.start();
     for (int i = 0; i < 10; i++) {
		System.out.println("this is another Thread");
	}
     sleep(2000);
     for (int i = 0; i <5; i++) {
		System.out.println("this is my talent");
	} 
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
class Eswar extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("this is my thread");
		}
	}
}
class Ravi extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
class Vinay extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("vinay name");
		}
	}
}