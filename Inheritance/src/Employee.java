
public class Employee extends Person {

	private String department;

	public Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName, String department) {
		super(id, firstName, lastName);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
