package work_03_05;

public class Pyramid_Pattern_Program {

	public static void main(String[] args) {
		int star=1,space=7;
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*"+" ");
			}System.out.println();
			if (i<=7) {
//				star=star+1;
				space=space-1;
			}
			
		}

	}
}
