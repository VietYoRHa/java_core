package lab06.regularexpression;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Boolean> inpCheckList = new ArrayList<>();

		System.out.printf("Enter CID: ");
		Pattern pattern = Pattern.compile("0[0-9]{11}");
		Matcher matcher = pattern.matcher(scanner.nextLine());
		inpCheckList.add(matcher.matches());

		System.out.printf("Enter password: ");
		pattern = Pattern.compile(".{6,}");
		matcher = pattern.matcher(scanner.nextLine());
		inpCheckList.add(matcher.matches());

		System.out.printf("Enter email: ");
		pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(scanner.nextLine());
		inpCheckList.add(matcher.matches());

		System.out.println("\nCheck Result: ");
		System.out.println("CID: " + inpCheckList.get(0));
		System.out.println("Password: " + inpCheckList.get(1));
		System.out.println("Email: " + inpCheckList.get(2));

		scanner.close();
	}
}
