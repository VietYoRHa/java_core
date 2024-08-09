package lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.printf("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number <= 2) {
			System.out.println("Không phải là số nguyên tố!");
			System.exit(0);
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					System.out.println("Không phải là số nguyên tố!");
					System.exit(0);
				}
			}
		}
		System.out.println("Là số nguyên tố");
		scanner.close();
	}
}
