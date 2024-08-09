package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.printf("Nhập số lượng phần tử của mảng: ");
		Scanner scanner = new Scanner(System.in);
		int arSize = scanner.nextInt();
		int[] intArray = new int[arSize];

		for (int i = 0; i < arSize; i++) {
			System.out.printf("Nhập giá trị phần tử %d: ", i + 1);
			intArray[i] = scanner.nextInt();
		}

		System.out.println();
		System.out.println("Mảng đã nhập: " + Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(intArray));
		System.out.println("Max = " + intArray[arSize - 1]);
		System.out.println("Min = " + intArray[0]);
		scanner.close();
	}
}
