package work_08_05;

import java.util.ArrayList;

public class Insertion_Element_InArray {

	public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add("java");
        a.add("food");
        a.add("water");
        a.add(5);
        a.add(10);
        System.out.println(a);
        a.add(0, "eswar");
        System.out.println(a);
        
	}

}
