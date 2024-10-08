package lab07;

public abstract class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public abstract double getScore();

	public double getPriceTax() {
		return this.price * this.tax;
	}
}
