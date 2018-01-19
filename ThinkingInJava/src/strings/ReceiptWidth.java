package strings;

import java.util.Formatter;

public class ReceiptWidth {
	
	private final int width = 25;

	private double total = 0;
	private Formatter f = new Formatter(System.out);

	public void printTitle() {
		f.format("%-" + width +"s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-" + width +"s %5s %10s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format("%-" + width +"." + width +"s %5d %10.2f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-" + width +"s %5s %10.2f\n", "Tax", "", total * 0.06);
		f.format("%-" + width +"s %5s %10s\n", "", "", "-----");
		f.format("%-" + width +"s %5s %10.2f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		ReceiptWidth receipt = new ReceiptWidth();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}
