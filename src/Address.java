
public class Address {

	private String streetName;
	private String cityName;
	private String stateName;
	private String zipName;

	public Address(){
		
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}
	
	public String toString(){
		return(this.getStreetName() + " " + ","+ this.getCityName() + " "+ "," + this.getStateName() + " "+"," + this.getZipName());
	}
	
	
}
