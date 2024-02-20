public class Person {
	//if not defined then null for string
	private String name;
	//if not defined then 0 for int
	private int age; 
	
	
	public Person() { //constructor signature
		name = "No Name";
		age = -1;
	}
	/*
	 * Copy constructor
	 */
	public Person(Person anotherPerson) {
		name = anotherPerson.name;
		age = anotherPerson.age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	 * implement a method named toString that
	 * does not take any parameters and it 
	 * returns the following information:
	 * name = ---, age = ---
	 */
	public String toString() {
		
		return("Name = "+ name + " age = " + age);
	}
}