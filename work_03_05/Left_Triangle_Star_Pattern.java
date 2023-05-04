package work_03_05;

public class Left_Triangle_Star_Pattern {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			for (int k = 4; k >i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}System.out.println("");
			
}
	}
}
