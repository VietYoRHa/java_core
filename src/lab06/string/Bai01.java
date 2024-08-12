package lab06.string;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Input username: ");
		String username = scanner.nextLine();
		System.out.printf("Input password: ");
		String password = scanner.nextLine();

		if (username.equals("hoidanit") && password.length() > 6) {
			System.out.println("Hợp lệ");
		} else {
			System.out.println("Không hợp lệ");
		}
		scanner.close();
	}
}
