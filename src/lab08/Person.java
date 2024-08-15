package lab08;

public class Person implements IPerson {
	protected String id;
	protected String name;
	protected int age;

	public Person() {
	};

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getID() {
		return this.id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void display() {
		System.out.println("ID = " + this.id + "\n" + "Name = " + this.name + "\n" + "Age = " + this.age);
	}
}
