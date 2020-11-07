package strategy_pattern.step2;

public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
