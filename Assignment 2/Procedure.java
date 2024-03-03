/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This class will help the driver app get set or call Procedure information
 * Due: 02/28/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alejandro Palacio
*/
public class Procedure {
	
	// Attributes
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharge;

	// Procedure method with default values
	public Procedure() {
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		procedureCharge = 0.0;
	}
	
	// Procedure method with set procedure name and procedure date
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	// Procedure method with set procedure name, procedure date, practitioner name and procedure charge
	public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.procedureCharge = procedureCharge;
	}
	
	// Get Procedure values
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getPractitionerName() {
		return practitionerName;
	}
	public double getProcedureCharge() {
		return procedureCharge;
	}
	
	// Set Procedure values
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	public void setProcedureCharge(double procedureCharge) {
		this.procedureCharge = procedureCharge;
	}
	
	// Display info
	public String toString() {
		return("\t\tProcedure: " + getProcedureName() + 
				"\n\t\tProcedureDate: " + getProcedureDate() + 
				"\n\t\tPractitioner: " + getPractitionerName() +
				"\n\t\tCharge = " + getProcedureCharge() + "");
	
	}
	
}
