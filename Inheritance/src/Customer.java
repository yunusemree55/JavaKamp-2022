
public class Customer extends Person {

	private String phoneNumber;

	public Customer(int id, String firstName, String lastName, String phoneNumber) {
		super(id,firstName,lastName);
		this.phoneNumber = phoneNumber;
	}
	
	public Customer() {
		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
