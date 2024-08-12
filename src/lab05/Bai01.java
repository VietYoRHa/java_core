package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.printf("Nhập số lượng phần tử: ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();

		ArrayList<Double> numList = new ArrayList<Double>();
		for (int i = 0; i < value; i++) {
			System.out.printf("Nhập phần tử %d: ", i + 1);
			numList.add(scanner.nextDouble());
		}

		System.out.println("Danh sách vừa nhập: " + numList);

		double totalSum = 0;
		for (double i : numList) {
			totalSum += i;
		}
		System.out.println("Tổng = " + totalSum);
		scanner.close();
	}
}
