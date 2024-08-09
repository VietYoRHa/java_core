package lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.printf("Nhập số (1 - 10): ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.println("Bảng cửu chương " + number + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}
		scanner.close();
	}
}
