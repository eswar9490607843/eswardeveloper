package work_16_05;

import java.util.Arrays;
import java.util.List;

public class FilterCities_ByStarting_Letter {

	public static void main(String[] args) {
		List<String> cityList=Arrays.asList("chennai","mumbai","bangalore","","delhi","chicago");
		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i).startsWith("c")) {
				System.out.println(cityList.get(i));
			}
		}
	}

}
