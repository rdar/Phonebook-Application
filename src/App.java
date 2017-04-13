import java.util.Scanner;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Person> myPersonList = new ArrayList();
		//Person person = new Person();
		
		Person person1 = new Person();
		person1.setFirstName("Rene");
		person1.setLastName("Darris");
		person1.setPhoneNumber("3147797881");
		Address address1 = new Address();
		address1.setCityName("St. Louis");
		address1.setStreetName("2328 Birch Hill Drive");
		address1.setStateName("MO");
		address1.setZipName("63033");
		person1.setAddress(address1);
		myPersonList.add(person1);
		
		ContactList contacts = new ContactList();
		contacts.setperson(myPersonList);
		
		Person person2 = new Person();
		person2.setFirstName("Peter");
		person2.setLastName("Darris");
		person2.setPhoneNumber("3149720593");
		Address address2 = new Address();
		address2.setCityName("Florissant");
		address2.setStreetName("123 Birch Hill Drive");
		address2.setStateName("MO");
		address2.setZipName("63033");
		person2.setAddress(address2);
		myPersonList.add(person2);
		
		
		Scanner in = new Scanner(System.in);	
		

		
		System.out.println("A - Search for Contact by First Name");
		System.out.println("B - Search for Contact by Last Name");
		System.out.println("C - Search for Contact by Phone Number");
		System.out.println("D - Add Contact");
		System.out.println("E - Delete Contact by PhoneNumber");
		System.out.println("F - Show All Contacts");
		
		
		
		String choice = in.nextLine();
		
		switch(choice){
		case "A": 
			
			System.out.println("Enter First Name");
			String inputA = in.nextLine();
			for(Person myPerson:contacts.getperson()){
				if(myPerson.getFirstName().equals(inputA)){
					System.out.println(myPerson.toString());
				break;
				}else{
					System.out.println("Could not be found");
					break;
				}
				
			
			}
			break;
		case "B":
			System.out.println("Enter Last Name");
			String inputB = in.nextLine();
			for(Person myPerson:contacts.getperson()){
				if(myPerson.getLastName().equals(inputB)){
					System.out.println(myPerson.toString());
					break;
					
				}
				else{
					System.out.println("Could not be found");
					break;
			}
			}	
			
			
		break;
		case "C":
			System.out.println("Enter Phone Number");
			String inputC = in.nextLine();
			for(Person myPerson:contacts.getperson()){
				if(myPerson.getPhoneNumber().equals(inputC)){
					System.out.println(myPerson.toString());break;
				}
				else
					System.out.println("Could not be found"); break;
			}
			
		break;
	
		case "D":
			Person person = new Person();
			System.out.println("Enter as formatted: John Middle Doe,114 Market St, St. Louis, MO, 63033, 6366435698");
			String input2 = in.nextLine();
			String [] myList =input2.split("\\s*,\\s*");
			String [] nameArray = myList[0].split(" ");
			String fullname= "";
			for(int i = 0; i< nameArray.length; i++)
			{
				if(i == nameArray.length - 1){
					person.setLastName(nameArray[i]);
				}
				else
				{
					fullname+= " "+nameArray[i];
					//firstName += nameArray[i];
				}
			}
			
			person.setFirstName(fullname);
			person.setPhoneNumber(myList[5]);
			
			Address address = new Address();
			
			address.setStreetName(myList[1]);
			address.setCityName(myList[2]);
			address.setStateName(myList[3]);
			address.setZipName(myList[4]);
			person.setAddress(address);
			myPersonList.add(person);
			
			for(Person myperson:myPersonList)
			{
				System.out.println(myperson.toString());
			}
			
			
		for(Person myperson:contacts.getperson())
		{
			System.out.println(myperson.toString());
		}
	
			break;
			case "E":
			System.out.println("Enter phone number");
		
			break;
		case "F":
			for(Person myperson:contacts.getperson())
			{
				System.out.println(myperson.toString());
			}

			break;
		
			default:
				break;
			
		}

}
}
