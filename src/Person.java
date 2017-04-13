
public class Person {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	public Person(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		String one = phoneNumber.substring(0,3);
		String two = phoneNumber.substring(3,6);
		String three = phoneNumber.substring(6,10);
		
		this.phoneNumber = "("+one+")-"+two+"-"+three;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString(){
		return(this.getFirstName() + " " + this.getLastName() + "," + " " + this.getAddress() + ","+ " "+ this.getPhoneNumber()); 
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//make to string use the to split method on the to string and then send it to an array list"
	//Address address = new Address();
	//person.setAddress(address);
}

	
	



