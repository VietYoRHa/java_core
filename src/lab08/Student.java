package lab08;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
		setGrade();
	}

	public int getMark() {
		return this.mark;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade() {
		if (this.mark >= 8)
			this.grade = "A";
		else if (7 <= this.mark && this.mark < 8)
			this.grade = "B";
		else if (6 <= this.mark && this.mark < 7)
			this.grade = "C";
		else if (5 <= this.mark && this.mark < 6)
			this.grade = "D";
		else
			this.grade = "F";
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Mark = " + this.mark + "\n" + "Grade = " + this.grade);
	}
}
