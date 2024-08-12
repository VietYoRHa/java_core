package lab06.string;

public class Student {
	private String name;
	private int id;

	public Student() {
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.id;
	}

	public Student createStudent(String name, int id) {
		Student std = new Student(name, id);
		return std;
	}
}
