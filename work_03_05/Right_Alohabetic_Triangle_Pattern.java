package work_03_05;

public class Right_Alohabetic_Triangle_Pattern {

	public static void main(String[] args) {
		char k='A';
       for (int i = 1; i <=7; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
	}

}
