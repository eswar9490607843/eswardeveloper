package work_11_05;

public class DeadLock_Example {

	public static void main(String[] args) {
      String thread1="my process 1";
      String thread2="my process 2";
      Thread t1=new Thread() {
    	  public void run() {
    		 synchronized(thread1) {
    			 System.out.println("thread 1 locked thread 2");
    		 }
    	  }
      };
      Thread t2=new Thread() {
    	  public void run() {
    		  synchronized(thread2) {
    			 System.out.println("thread 2 locked thread 1"); 
    		  }
    	  }
      };
      t1.start();
      t2.start();
	}

}
