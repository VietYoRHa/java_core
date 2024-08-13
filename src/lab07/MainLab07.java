package lab07;

public class MainLab07 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVienIT("123", "ABC", 4000, 0.1, "Vietnamese", 8, 5);
		SinhVien sv2 = new SinhVienCoKhi("456", "DEF", 3600, 0.2, "Machine", 4, 3);

		System.out.println("=> Infomation:");
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());

		System.out.println("\n=> Test getPriceTax() (non-abstract method): ");
		System.out.println(sv1.name + " = " + sv1.getPriceTax());
		System.out.println(sv2.name + " = " + sv2.getPriceTax());

		System.out.println("\n=> Test getScore() (abstract method): ");
		System.out.println(sv1.name + " = " + sv1.getScore());
		System.out.println(sv2.name + " = " + sv2.getScore());
	}
}
