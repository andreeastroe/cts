package dp.flyweight;

import java.util.HashMap;

public class FlyweightFactoryOfBills {

	private static HashMap<BillFormat, Bill> listOfBills = new HashMap<>();
	
	static Bill getBill(BillFormat format) {
		Bill bill = listOfBills.get(format);
		if(bill == null) {
			//it's the first time a bill of this time is printed
			bill = new Bill(format);
			listOfBills.put(format, bill);
		}
		return bill;
	}
	
	static int getNoBills() {
		return listOfBills.size();
	}
}
