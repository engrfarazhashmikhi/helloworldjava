package helloworldjava;

public class Employee extends Person {
	private String designation;
	private double salary;

	public Employee(final String empName) {
		super(empName.trim());
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public void returnEmployeeDetails() {
		System.out.println(Messages.getString("Employee.0") + getPersonName() + Messages.getString("Employee.1") + designation + Messages.getString("Employee.2") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ salary + Messages.getString("Employee.3")); //$NON-NLS-1$
	}

	public void setDesignation(final String des) {
		designation = des.trim();
	}

	public void setSalary(final double sal) {
		salary = sal;
	}
}
