package work_19_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Methods_Practice {
  public static void main(String[] args) {
	//distinct example
	  List<Integer> empList=new ArrayList<Integer>();
	  empList.add(10);
	  empList.add(2);
	  empList.add(3);
	  empList.add(4);
	  empList.add(5);
	  empList.add(60);
	  System.out.println("empList:"+empList.stream().distinct().count());
	 System.out.println("-------------------end-------------");
	 
	 
	 List<String> names=new ArrayList<String>();
     names.add("eswar");
     names.add("ravi");
     names.add("vinay");
     names.add("praddep");
    List<String> s1=names.stream().sorted().collect(Collectors.toList());
    System.out.println(s1);
    System.out.println("-------------End---------------");
    
    // limit
    List<String> names1=new ArrayList<String>();
    names1.add("eswar");
    names1.add("ravi");
    names1.add("vinay");
    names1.add("praddep");
    System.out.println(names1.stream().limit(3).collect(Collectors.toList()));
    System.out.println("----------END----------------");
    
    //skip
    List<String> names2=new ArrayList<String>();
    names2.add("eswar");
    names2.add("ravi");
    names2.add("vinay");
    names2.add("praddep");
    System.out.println(names2.stream().skip(1).collect(Collectors.toList()));
    System.out.println("------------END---------------");
    
    
    //anymatch
    List<String> names3=new ArrayList<String>();
    names3.add("eswar");
    names3.add("ravi");
    names3.add("vinay");
    names3.add("praddep");
   boolean br = names3.stream().anyMatch(a->Character.isUpperCase(a.charAt(0)));
    System.out.println(br);
     
}
}
