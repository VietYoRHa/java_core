package lab07;

public class SinhVienIT extends SinhVien {
	private String language;
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(String id, String name, double price, double tax, String language, double scoreJava,
			double scoreHTML) {
		super(id, name, price, tax);
		this.language = language;
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	public double getScore() {
		return (this.scoreJava * 2 + scoreHTML) / 3;
	}

	@Override
	public String toString() {
		String svString = "id = " + this.id + "\n" + "name = " + this.name + "\n" + "price = " + this.price + "\n"
				+ "tax = " + this.tax + "\n" + "language = " + this.language + "\n" + "scoreJava = " + this.scoreJava
				+ "\n" + "scoreHTML = " + this.scoreHTML + "\n";
		return svString;
	}
}
