package strategy_pattern.step2;

public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have missile and can attack with it.");
	}

}
