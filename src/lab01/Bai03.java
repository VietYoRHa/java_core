package lab01;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập độ dài cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		double thetich = Math.pow(canh, 3);
		System.out.println("Thể tích: " + thetich);
		scanner.close();
	}
}
