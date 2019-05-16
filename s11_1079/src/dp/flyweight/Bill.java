package dp.flyweight;

public class Bill implements IPrintingBill {

	//concrete flyweight from the diagram
	private BillFormat format;
	//other fields
	//... font, position, allignment of how to print the bill
	
	
	public Bill(BillFormat format) {
		super();
		this.format = format;
	}

	@Override
	public void printBill(InfoBill infoBill) { 
		System.out.println("Printing " + infoBill.getCost() + " in format " + this.format);
	}
}
