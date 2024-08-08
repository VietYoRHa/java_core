package lab01;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm: ");
		double score = scanner.nextDouble();
		System.out.println("Sinh viên " + name + " có điểm trung bình là " + score);
		scanner.close();
	}
}
