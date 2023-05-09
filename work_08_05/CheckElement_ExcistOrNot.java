package work_08_05;

import java.util.ArrayList;

public class CheckElement_ExcistOrNot {

	public static void main(String[] args) {
       ArrayList d=new ArrayList<>();
       d.add("buger");
       d.add("pizza");
       d.add("eggroll");
       d.add("noodles");
       System.out.println(d.contains("pizza"));
       System.out.println(d.contains("chips"));
	}

}
