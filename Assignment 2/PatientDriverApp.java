/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This driver class will call upon the patient and procedure methods to display necessary or relevant information
 * Due: 02/28/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alejandro Palacio
*/
public class PatientDriverApp {

	public static void main(String[] args) {
		
		// Procedure1 information
		Procedure procedure1 = new Procedure();
		procedure1.setProcedureName("Physical Exam");
		procedure1.setProcedureDate("7/20/2019");
		procedure1.setPractitionerName("Dr. Irvine");
		procedure1.setProcedureCharge(3250.0);
		
		// Procedure2 information
		Procedure procedure2 = new Procedure("X-Ray", "7/20/2019");
		procedure2.setPractitionerName("Dr. Smith");
		procedure2.setProcedureCharge(5500.43);
		
		// Procedure3 information
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019" , "Dr. Jamison", 1400.75);
		
		// Displays patient information
		displayPatient();
		// Displays Procedure information
		displayProcedure(procedure1, procedure2, procedure3);
		// Calculates Total Charges and displays it
		calculateTotalCharges(procedure1, procedure2, procedure3);
		
		// Prints out Student information
		System.out.println("Student name: Alejandro Palacio\n" + "MC#: MC21124\n" + "Due Date: 02/28/2024 \n");
	}
	
	
	//Display Patient method: Contains patient info and prints it out when called in main
	public static void displayPatient() {
		Patient patient = new Patient("Jenny","Elaine","Santori","123 Main Street","Mytown","CA","01234","777-555-6789","Bill Santori","777-555-1212");
		System.out.println("Patient info: ");
		System.out.println(patient.toString());
		System.out.print("\n");
	}
	//Display Procedure method: Contains procedure info and prints it out when called in main
	public static void displayProcedure(Procedure procedure1, Procedure procedure2, Procedure procedure3){
		System.out.println(procedure1.toString());
		System.out.print("\n");
		System.out.println(procedure2.toString());
		System.out.print("\n");
		System.out.println(procedure3.toString());	
		System.out.print("\n");
	}
	
	// Calculates total charges for procedures
	public static void calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3){
		System.out.print("Total Charges: $");
        System.out.println(procedure1.getProcedureCharge() + procedure2.getProcedureCharge()+ procedure3.getProcedureCharge());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
