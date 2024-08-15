package lab08;

public class MainLab08 {
	public static void main(String[] args) {
		Person p1 = new Student("123", "ABC", 21, 8);
		p1.display(); // Student display()

		System.out.println();

		Person p2 = new Person("456", "DEF", 18);
		p2.display(); // Person display()
	}
}
