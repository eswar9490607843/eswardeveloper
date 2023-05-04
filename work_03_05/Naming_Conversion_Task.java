package work_03_05;

public class Naming_Conversion_Task {

	public static void main(String[] args) {
       String word="java"; // valid
       String Word="java"; //valid
       String word@="java string"; //invalid because of used special character
       String word12="java string";  //valid
       String 12word="java string";  //invalid because variable name started with digit 
       String int="java"; //invalid because of reserved (keywords) should not use as variable name
       String *java="java"; //invalid because of used special character
       String symbols$="100 dollars"; //valid
       String word ="java"; // invalid because of variable name using second time
       String word="comp"; // invalid because of variable name using multiple times
       String word=" comp"; // invalid because of variable name using multiple times
       String word_="java"; // valid
       String word-="java is here"; //invalid because of have to use character,digit,_,$ only
       String capital;="delhi";//invalid because of have to use character,digit,_,$ only for variable name
       
	}

}
