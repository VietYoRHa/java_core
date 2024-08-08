package lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
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
}
