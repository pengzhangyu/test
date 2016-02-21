package test;

class Person {
	String name = " ";

	public Person(String name) {
		this.name = name;
	}
}

class Employee extends Person {
	String empNO = "0000";

	public Employee(String empNO) {
		super(empNO);
		this.empNO = empNO;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("1109");
		System.out.println(e.empNO);
	}
}
