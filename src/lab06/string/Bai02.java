package lab06.string;

import java.util.ArrayList;

public class Bai02 {
	public static void main(String[] args) {
		Student student = new Student();

		Student st1 = student.createStudent("Nguyễn Văn A", 1);
		Student st2 = student.createStudent("Trần Thị B", 2);
		Student st3 = student.createStudent("Nguyễn Trọng C", 3);
		Student st4 = student.createStudent("Đoàn D", 4);
		Student st5 = student.createStudent("Nguyễn Quốc E", 5);

		ArrayList<Student> arrStudents = new ArrayList<Student>();
		arrStudents.add(st1);
		arrStudents.add(st2);
		arrStudents.add(st3);
		arrStudents.add(st4);
		arrStudents.add(st5);

		String strCheck = "Nguyễn";
		ArrayList<Student> arrStdStrCheck = new ArrayList<Student>();

		System.out.println("=> Danh sách sinh viên:");
		for (Student std : arrStudents) {
			System.out.println(std.getID() + " - " + std.getName());
			if (std.getName().startsWith(strCheck)) {
				arrStdStrCheck.add(std);
			}
		}

		System.out.printf("\n=> Sinh viên có tên bắt đầu bằng \"%s\":\n", strCheck);
		for (Student std : arrStdStrCheck) {
			System.out.println(std.getID() + " - " + std.getName());
		}
	}
}
