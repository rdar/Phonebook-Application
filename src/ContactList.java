import java.util.ArrayList;

public class ContactList {
	
private ArrayList<Person> person;
	
	
	public void Contactslist(){
		this.person = new ArrayList<Person>();
	}
	
	public ArrayList<Person> getperson(){
		return this.person;
	}
	
	public void setperson(ArrayList<Person> person){
		this.person = person;
	}

	
	
	
	//public String toString(){
		//return (this.person.get(0) +" "  + this.person.get(1) + ","+" " + this.person.get(2)+ " "+ this.person.get(3) +","+" " + this.person.get(4) +","+" "+ this.person.get(5) +"," +" "+ this.person.get(6) +","  +" "+ this.person.get(7) + "\n");	}
	
	public void removePerson(String input3){
		
		for (int i =0; i < person.size(); i++) {
			
			if(person.get(i).getPhoneNumber() == input3);
			{
				person.remove(i);
				break;
			}
			
		}
	}

}
