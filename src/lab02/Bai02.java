package lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("Giải phương trình ax^2 + bx + c = 0");
		System.out.println("-----------------------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập a: ");
		int a = scanner.nextInt();
		System.out.printf("Nhập b: ");
		int b = scanner.nextInt();
		System.out.printf("Nhập c: ");
		int c = scanner.nextInt();

		switch (a) {
		case 0:
			if (b == 0 && c == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				double x = -c / (double) b;
				System.out.println("x = " + x);
			}
			scanner.close();
			System.exit(0);
		default:
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm riêng biệt:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			scanner.close();
			System.exit(0);
		}
	}
}
