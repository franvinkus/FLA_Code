package solution;

public class PersonalData {
	private String name,DOB,address,email, phoneNumber;
	public PersonalData(String name, String dOB, String address, String email, String phoneNumber) {
		this.name = name;
		DOB = dOB;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	// Getters
	public String getName() {
		return name;
	}
	public String getDOB() {
		return DOB;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	// Setters
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
