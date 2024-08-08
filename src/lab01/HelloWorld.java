package lab01;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Your name: ");
		String name = scanner.nextLine();
		System.out.printf("Your age: ");
		int age = scanner.nextInt();
		System.out.println("Hello " + name + ", you are " + age + " years old!");
		scanner.close();
	}

}
