
public class Person {
	//if not defined then null for string
	public String name;
	
	//if not defined then 0 for int
	public int age; 
	
	
	public Person() { //constructor signature
		name = "No Name";
		age = -1;
	}
	
	public Person(int newAge){
		age = newAge;
	}
	
	public Person(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public void getOlder() {
		age++;
	}
	/*
	 * implement a method name toString that
	 * does not take any parameters and it 
	 * returns the following information:
	 * name = ---, age = ---
	 */
	public String toString() {
		
		return("Name = "+ name + " age = " + age);
	}
}

