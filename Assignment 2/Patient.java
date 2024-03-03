/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This class will help the driver app get set or call Patient information
 * Due: 02/28/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alejandro Palacio
*/
public class Patient {

	// Attributes
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;

	// Patient method with default values
	public Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipcode = "";
		phoneNumber = "";
		emergencyContactName = "";
		emergencyContactPhoneNumber = "";
		}
	
	// Patient method with first name, middle name and last name
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	// Patient method with all attributes
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, 
			String zipcode, String phoneNumber, String emergencyContactName, String emergencyContactPhoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhoneNumber =  emergencyContactPhoneNumber;
	}
	
	
	// Get Procedure values
	public String getFirstName(){
		return firstName;
	}
	public String getMiddleName(){
		return middleName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getStreetAddress(){
		return streetAddress;
	}
	public String getCity(){
		return city;
	}
	public String getstate(){
		return state;
	}
	public String getZipcode(){
		return zipcode;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getEmergencyContactName(){
		return emergencyContactName;
	}
	public String getEmergencyContactPhoneNumber(){
		return emergencyContactPhoneNumber;
	}
	
	// Set Procedure values
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setstate(String state){
		this.state = state;
	}
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public void setEmergencyContactName(String emergencyContactName){
		this.emergencyContactName = emergencyContactName;
	}
	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber){
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}
	
	
	// build name method
	public String buildFullName(String firstName, String middleName, String lastName) {
		return (firstName + " " + middleName + " " + lastName);
	}
	
	// build address method
	public String buildAddress(String address, String city, String state, String zipcode) {
		return (address + " " + city + " " + state + " " + zipcode);
	}
	
	// build emergency contact method
	public String buildEmergencyContact(String emergencyContactName, String emergencyContactPhoneNumber) {
		return (emergencyContactName + " " + emergencyContactPhoneNumber);
	}
	
	// Display info
	public String toString() {
		return("\tName: " + this.buildFullName(firstName, middleName, lastName) + 
				"\n\tAddress: " + this.buildAddress(streetAddress, city, state, zipcode) + 
				"\n\tEmergency Contact: " + this.buildEmergencyContact(emergencyContactName, emergencyContactPhoneNumber));
	
	
	
	
	
	}
	
	
	
}