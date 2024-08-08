package lab01;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		double dai = scanner.nextDouble();
		System.out.println("Nhập chiều rộng: ");
		double rong = scanner.nextDouble();
		double chuvi = (dai + rong) * 2;
		double dientich = dai * rong;
		double canhnhonhat = Math.min(dai, rong);
		System.out.println("Chu vi: " + chuvi);
		System.out.println("Diện tích: " + dientich);
		System.out.println("Cạnh nhỏ nhất: " + canhnhonhat);
		scanner.close();
	}
}
