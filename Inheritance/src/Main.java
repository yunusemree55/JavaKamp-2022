
public class Main {

	public static void main(String[] args) {
		Person employee1 = new Employee(1,"Arthur", "Morgan", "Software Engineer");
		Person customer1 = new Customer(2,"Yunus Emre","Çiçek","1973508462");
		
		Employee employee2 = new Employee(3,"John", "Marston", "Electric-Electronic Engineer");
		Customer customer2 = new Customer(4,"Mert Ali","Işık","7049351268");
		
		Person[] people = {employee1,employee2,customer1,customer2};
		
		for(Person person: people) {
			
			System.out.println(person.getFirstName() + " " + person.getLastName());
			System.out.println("---------------------------");
			
		}
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.Add(employee2);
		customerManager.Add(customer2);

	}

}
