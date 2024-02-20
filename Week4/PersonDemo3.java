
public class PersonDemo3 {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		p1.setName("Kate");
		p1.setAge(18);
		
		Person p2 = new Person();
		p2 = p1;
		System.out.println(p2.getName());
		
		/*
		 *Create a new Person object 3
		 *using the third constructor then define a new Person object
		 *p4 that is a copy of p3 
		 */
		Person p3 = new Person("Kate", 24);
		//Person p4 = new Person();
		//p4 = p3;

		Person p4 = new Person (p3.getName(), p3.getAge());
		Person p5 = new Person();
		System.out.println(p4);
	}
}