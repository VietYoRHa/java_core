package lab02;

import java.util.Scanner;

public class Bai04 {
	public static void bai01() {
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

	public static void bai02() {
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

	public static void bai03() {
		System.out.println("Tính tiền điện");
		System.out.println("--------------");

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số điện: ");
		int value = scanner.nextInt();

		int result = 0;
		if (0 <= value && value <= 100) {
			result = value * 1000;
		} else {
			result = 100 * 1000 + (value - 100) * 1500;
		}
		System.out.println("Tiền điện: " + result);
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.printf("Lựa chọn của bạn: ");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		System.out.println();

		switch (option) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.out.println("Goodbye!");
		}
		scanner.close();
		System.exit(0);
	}
}
