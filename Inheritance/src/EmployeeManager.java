
public class EmployeeManager {

	public void Add(Employee employee) {

		System.out.println("Employee added: " + employee.getFirstName() + " " + employee.getLastName());

	}

	public void Update(Employee employee) {

		System.out.println("Employee updated: " + employee.getFirstName() + " " + employee.getLastName());

	}

	public void Delete(Employee employee) {

		System.out.println("Employee deleted: " + employee.getFirstName() + " " + employee.getLastName());

	}

}
