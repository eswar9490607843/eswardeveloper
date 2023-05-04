package work_03_05;

public class OutPutChecking_IfElse {

	public static void main(String[] args) {
		int num1=10,num2=5,num3=20,largestNumber;
		if(num1>=num2) {
			largestNumber=num1;
          if (num1>=3) {
        	  largestNumber=num1;
		}else {
			largestNumber=num3;
		}
		}else {
			if (num2>=num3) {
				largestNumber=num2;	
			}else {
				largestNumber=num3;
			}
		}
		System.out.println("Largest Number is"  +largestNumber);
	}

}
