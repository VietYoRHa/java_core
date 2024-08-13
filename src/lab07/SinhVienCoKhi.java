package lab07;

public class SinhVienCoKhi extends SinhVien {
	private String skill;
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill, double scoreCNC,
			double scorePLC) {
		super(id, name, price, tax);
		this.skill = skill;
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	public double getScore() {
		return (this.scoreCNC + this.scorePLC) / 2;
	}

	@Override
	public String toString() {
		String svString = "id = " + this.id + "\n" + "name = " + this.name + "\n" + "price = " + this.price + "\n"
				+ "tax = " + this.tax + "\n" + "skill = " + this.skill + "\n" + "scoreCNC = " + this.scoreCNC + "\n"
				+ "scorePLC = " + this.scorePLC + "\n";
		return svString;
	}
}
