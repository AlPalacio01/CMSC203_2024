import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//shows default 
		Person p0 = new Person();
		System.out.println(p0.name);
		System.out.println(p0.age);
		
		//person 1 stats
		Person p1 = new Person();
		p1.name = "John";
		p1.age = 20;
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.getOlder();
		System.out.println(p1.age);
		
		//person 2 stats
		Person p2 = new Person();
		p2.name = "kate";
		p2.age = 18;
		System.out.println(p2.name);
		System.out.println(p2.age);
		
	}

}







