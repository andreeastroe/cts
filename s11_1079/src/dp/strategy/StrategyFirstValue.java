package dp.strategy;

public class StrategyFirstValue implements IProcessing{

	@Override
	public int getValue(int[] v) {
		return v[0];
	}

	
}
