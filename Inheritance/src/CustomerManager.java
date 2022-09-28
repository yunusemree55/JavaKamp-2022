
public class CustomerManager {

	public void Add(Customer customer) {

		System.out.println("Customer added: " + customer.getFirstName() + " " + customer.getLastName());

	}

	public void Update(Customer customer) {

		System.out.println("Customer updated: " + customer.getFirstName() + " " + customer.getLastName());

	}

	public void Delete(Customer customer) {

		System.out.println("Customer deleted: " + customer.getFirstName() + " " + customer.getLastName());

	}

}
