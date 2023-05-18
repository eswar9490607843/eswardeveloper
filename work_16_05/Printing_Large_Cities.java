package work_16_05;

import java.util.Arrays;
import java.util.List;

public class Printing_Large_Cities {

	public static void main(String[] args) {
		List<String> cityList=Arrays.asList("chennai","mumbai","bangalore","","delhi","chicago");
		for (int i = 0; i <cityList.size(); i++) {
			if (cityList.get(i).length()>6) {
				System.out.println(cityList.get(i));
			}
		}
	}

}
