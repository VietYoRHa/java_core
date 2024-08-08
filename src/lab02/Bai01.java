package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Giải phương trình ax + b = 0");
		System.out.println("----------------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập a: ");
		int a = scanner.nextInt();
		System.out.printf("Nhập b: ");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = -b / (double) a;
			System.out.println("x = " + x);
		}

		scanner.close();
	}
}
