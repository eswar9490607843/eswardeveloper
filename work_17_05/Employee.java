package work_17_05;

import java.util.ArrayList;
import java.util.List;

class DetailsOfEmployee{
	String name;
	double salary;
	String departmentname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getDepartmentName() {
		return departmentname;
	}
	public void setDepartmentName(String departmentname) {
		this.departmentname=departmentname;
	}
	@Override
	public String toString() {
		return "DetailsOfEmployee [name=" + name + ", salary=" + salary + ", departmentname=" + departmentname + "]";
	}	
}

public class Employee {

	public static void main(String[] args) {
		DetailsOfEmployee obj1=new DetailsOfEmployee();
		obj1.setName("Alisha");
		obj1.setSalary(20000);
		obj1.setDepartmentName("civil");
		
		DetailsOfEmployee obj2=new DetailsOfEmployee();
		obj2.setName("mukesh");
		obj2.setSalary(80000);
		obj2.setDepartmentName("mechanical");

		
		List<DetailsOfEmployee>empList=new ArrayList<>();
		empList.add(obj1);
		empList.add(obj2);
		
		for (DetailsOfEmployee d : empList) {
				System.out.println(d);
		}
	}
}


