package lab09;

import java.util.Scanner;

public class SinhVien {
	private String masv;
	private String hoten;
	private double diem;
	private int age;

	@Override
	public String toString() {
		return this.masv + " - " + this.hoten + " - " + this.diem + " - " + this.age;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập mã sinh viên: ");
		this.masv = scanner.nextLine();
		System.out.printf("Nhập họ tên: ");
		this.hoten = scanner.nextLine();

		while (true) {
			System.out.printf("Nhập điểm (0 - 10): ");
			try {
				double inpDiem = scanner.nextDouble();
				if (inpDiem < 0 || inpDiem > 10) {
					System.out.println("Giá trị không nằm trong phạm vi!");
				} else {
					this.diem = inpDiem;
					break;
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Giá trị không phải là số thực!");
			}
		}

		while (true) {
			System.out.printf("Nhập tuổi (18 - 100): ");
			try {
				int inpAge = scanner.nextInt();
				if (inpAge < 18 || inpAge > 100) {
					System.out.println("Giá trị không nằm trong phạm vi!");
				} else {
					this.age = inpAge;
					break;
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Giá trị không phải là số nguyên!");
			}
		}
		scanner.close();
	}

	public void showInfo() {
		System.out.println(this.toString());
	}
}
