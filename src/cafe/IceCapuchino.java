package cafe;

public class IceCapuchino extends Menu {
	static int count = 0;
	private int total;

	public IceCapuchino() {
		// TODO Auto-generated constructor stub
	}

	public IceCapuchino(String name, int price, int total) {
		super(name, price);

		this.total = count * price;

	}

	@Override
	public String toString() {
		return String.format(" %17s %10d %18d %20d", super.getName(), super.getPrice(), count,
				super.getPrice() * count);
	}
}
