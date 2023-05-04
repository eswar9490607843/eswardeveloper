package work_03_05;

public class OutPutChecking_NestedIfElse2 {

	public static void main(String[] args) {
       int age=25;
       if (age<=0) {
		System.out.println("error");
	}else if(age<=16) {
		System.out.println("too young");
	}else if (age<100) {
		System.out.println("come in!");
	}else {
		System.out.println("really?");
	}
	}

}
