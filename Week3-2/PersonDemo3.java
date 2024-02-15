
public class PersonDemo3 {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person();
		p2 = p1;
		System.out.println(p2.name);
		
		/*
		 *Create a new Person object 3
		 *using the third constructor then define a new Person object
		 *p4 that is a copy of p3 
		 */
		Person p3 = new Person("Kate", 24);
		//Person p4 = new Person();
		//p4 = p3;

		Person p4 = new Person (p3.name, p3.age);
		Person p5 = new Person();
		System.out.println(p4);
	}
}