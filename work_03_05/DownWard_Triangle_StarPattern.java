package work_03_05;

public class DownWard_Triangle_StarPattern {

	public static void main(String[] args) {
       for (int i = 5; i >=0; i--) {
		for (int j = 0; j <i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
