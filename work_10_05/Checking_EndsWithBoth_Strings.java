package work_10_05;

public class Checking_EndsWithBoth_Strings {

	public static void main(String[] args) {
      String attribute1="keep smile";
      String attribute2="keep smiLe";
      String ending="le";
      System.out.println(attribute1.endsWith(ending));
      System.out.println(attribute2.endsWith(ending));
	}

}
