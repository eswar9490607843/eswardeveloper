package work_16_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_UpperCase {

	public static void main(String[] args) {
        List<String> cityList=Arrays.asList("chennai","mumbai","bangalore","","delhi","chicago");
        for (int i = 0; i < cityList.size(); i++) {
			String newValue=cityList.get(i).toUpperCase();
			cityList.set(i, newValue);
		}
        System.out.println(cityList);
	}

}
