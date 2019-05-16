package dp.strategy;

public class Application {

	public static void main(String[] args) {
		Data data = new Data(50);
		data.setStrategy(new StrategyFirstValue());
		System.out.println("Obtained value: " + data.getValue());
		data.setStrategy(new StrategyLastValue());
		System.out.println("Obtained value: " + data.getValue());

	}

}
