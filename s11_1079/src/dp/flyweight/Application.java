package dp.flyweight;

public class Application {

	public static void main(String[] args) {
		//list of information within the bills
		InfoBill[] listInfo = new InfoBill[40];
		for( int i = 0; i < 40; i++) {
			listInfo[i] = new InfoBill(100+i); 
		}

		//list of formating bills
		Bill[] listOfPrintingBills = new Bill[40];
		for( int i=0; i<40; i++) {
			//DO NOT
			//listPrintingBills[i] = new Bill(...);
			listOfPrintingBills[i]= FlyweightFactoryOfBills.getBill(BillFormat.valueOf("FORMAT" + (i%3+1))); 
		}
		
		//combine the two parts
		for(int i = 0; i <40;i++) {
			listOfPrintingBills[i].printBill(listInfo[i]);
		}
		
		//this is flyweight
		System.out.println("Printing 40 bills");
		System.out.println("With just " + FlyweightFactoryOfBills.getNoBills() + " bill formats");
	}

}
