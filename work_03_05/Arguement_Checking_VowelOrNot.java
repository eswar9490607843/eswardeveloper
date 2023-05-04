package work_03_05;

public class Arguement_Checking_VowelOrNot {

	public boolean isVowel(char vowel) {
		if (vowel=='A'||vowel=='E'||vowel=='I'||vowel=='O'||vowel=='U') 
			return true;
			else 
				return false;
	}
	public static void main(String []args) {
		Arguement_Checking_VowelOrNot var=new Arguement_Checking_VowelOrNot();
		boolean result=var.isVowel('E');
		System.out.println(result);
	}
	}

	