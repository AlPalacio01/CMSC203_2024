
public class EqualsDemo {

	public static void main(String[] args) {
		/*
		 * Create two variables of type int x and y and set them to 9 and 8
		 * Write code snippet that displays yes if x and y are equals and no
		 * if they are not equal to each other
		 * 
		 * Create two Person objects p1 and p2 with name kate 10 and check for
		 * equality of p1 and p2
		 */
		
		int x = 9, y = 8;
		
		if(x == y) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		Person p1 = new Person("Kate", 10);
		Person p2 = new Person(p1);
		
		System.out.println(p1 == p2);
//		if(p1.getName().equals(p2.getName()) && p1.getAge() == p2.getAge()) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		if (p1.equals(p2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
