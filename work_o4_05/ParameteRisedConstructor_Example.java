package work_o4_05;

public class ParameteRisedConstructor_Example {  
    int id;  
    String name;  
    ParameteRisedConstructor_Example(int i,String n){  
   this. id = i;  
   this. name = n;  
    }    
    void eswar(){
    	System.out.println(id);
    	System.out.println(name);
    	}  
    public static void main(String args[]){  
   
    	 ParameteRisedConstructor_Example p = new  ParameteRisedConstructor_Example(111,"Karan");  
           p.eswar();
   }  
}  
