package lab04;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product prd = new Product(name, price, tax);
		return prd;
	};

	public void xuatThongTin(Product prd) {
		System.out.println("name = " + prd.getName() + ", price = " + prd.getPrice() + ", tax = " + prd.getTax());
	};

	public double getTaxPrice(Product prd) {
		return prd.getPrice() * prd.getTax();
	}
}
