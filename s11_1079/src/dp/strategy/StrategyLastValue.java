package dp.strategy;

public class StrategyLastValue implements IProcessing{

	@Override
	public int getValue(int[] v) {
		return v[v.length-1];
	}

	
}
