package com.employee;
import java.util.TreeSet;

public class TestEmployee {
	public static void main(String[] args) {

		Employee emp1 = new Employee(8, "Amit", "Pune");
		Employee emp2 = new Employee(3, "Saurabh", "Sangli");
		Employee emp3 = new Employee(2, "Radha", "Kolhapur");
		
		CustomEmpIDComparator eIdCom = new CustomEmpIDComparator();

		CustomEmpNameComparator eNameCom = new CustomEmpNameComparator();

		CustomEmpCityComparator eCityCom = new CustomEmpCityComparator();

		TreeSet ts = new TreeSet<>(eIdCom);

//		TreeSet ts = new TreeSet<>(eNameCom);

//		TreeSet ts = new TreeSet<>(eCityCom);

		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp1);

	

		System.out.println(ts);
	}
	

}
