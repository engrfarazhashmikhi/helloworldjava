package helloworldjava;

public class Employee extends Person {
	private String designation;
	private double salary;

	public Employee(String empName) {
		super(empName.trim());
	}

	public String getDesignation() {
		return this.designation;
	}

	public double getSalary() {
		return this.salary;
	}

	public void returnEmployeeDetails() {
		System.out.println("Mr. " + getPersonName() + " has a Designation of " + designation + " with a Salary of "
				+ salary + ".");
	}

	public void setDesignation(String des) {
		this.designation = des.trim();
	}

	public void setSalary(double sal) {
		this.salary = sal;
	}
}
