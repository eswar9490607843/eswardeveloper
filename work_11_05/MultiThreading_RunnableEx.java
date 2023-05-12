package work_11_05;

import work_11_05.*;

class MyThread implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
public class MultiThreading_RunnableEx {
public static void main(String[] args) {
	MyThread m1=new MyThread();
	Thread m2=new Thread(m1);
	m2.start();
}
}

