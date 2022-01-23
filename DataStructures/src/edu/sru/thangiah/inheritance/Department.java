package edu.sru.thangiah.inheritance;

/*
 * Aggregation
 */

class Student {
	Student(){
		System.out.println("Student");
	}
}
class Staff{
	Staff(){
		System.out.println("Staff");
	}
}
class Faculty{
	Faculty(){
		System.out.println("Faculty");
	}
	
}
public class Department {
	
	Student student;
	Staff staff;
	Faculty faculty;
	
	Department()
	{
		student = new Student();
		staff = new Staff();
		faculty = new Faculty();
	}
	
	public static void main(String[] args) {
	
		Department cpsc = new Department();
		Staff staff1 = new Staff();
	}
}
