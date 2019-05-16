package dp.strategy;

public class Data {

	//collection of data
	int[] values = null;
	//the current strategy
	IProcessing strategy = null;
	
	public Data(int n) {
		this.values = new int[n];
		for ( int i = 0; i< n; i++) {
			this.values[i]= 10+i; 
		}
	}

	public int getValue() {
		return this.strategy.getValue(values);
	}

	public void setStrategy(IProcessing strategy) {
		this.strategy = strategy;
	}
	
	
	
	
}
