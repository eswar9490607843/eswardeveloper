package work_03_05;

public class Arguments_ReturnIn_Sum {

	public int getTotal(int a,int b) {
		return a+b;
	}
	public static void main(String []args) {
		Arguments_ReturnIn_Sum sum=new Arguments_ReturnIn_Sum();
		int result=sum.getTotal(10, 20);
		System.out.println(result);
	}

}
