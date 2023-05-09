package work_08_05;

public class PalindeomeCheck_String {

	public static void main(String[] args) {
		String name="eswar";
		String rev="";
		for (int i = name.length()-1; i >=0; i--) {
			rev=rev+name.charAt(i);

		}
		if (name.equals(rev)) {
			System.out.println("Given String is palindrome");
		}
		else
			System.out.println("given String is not palindrome");
	}
}
