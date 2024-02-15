
public class PersonDemo2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(16);
		System.out.println(p1.name + " " + p1.age);
		
		Person p2 = new Person("Alex", 23);
		System.out.println(p2.name + " " + p2.age);
		
		System.out.println(p2.toString());
	}
	
	
}