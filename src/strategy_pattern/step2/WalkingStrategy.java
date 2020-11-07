package strategy_pattern.step2;

public class WalkingStrategy implements MovingStrategy {

	public void move() {
		System.out.println("I can only walk.");
	}

}
