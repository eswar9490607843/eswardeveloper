package work_08_05;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateValues_ByForEachLoop {

	public static void main(String[] args) {
      ArrayList a1=new ArrayList();
      a1.add("mahesh");
      a1.add("ravi");
      a1.add("vinay");
      a1.add("praddep");
      a1.add("anand");
      a1.add("eswar");
      for(Object a2:a1)
      System.out.println(a2);
	}

}
