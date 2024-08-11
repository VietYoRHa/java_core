package lab04;

public class MainLab04 {
	public static void main(String[] args) {
		Product product = new Product(); // copy of class, driver

		Product prd1 = product.nhapThongTin("mouse", 50, 0.1);
		product.xuatThongTin(prd1);
		System.out.println(prd1.getName() + " TaxPrice = " + product.getTaxPrice(prd1));
	}
}
