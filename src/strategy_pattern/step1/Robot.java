package strategy_pattern.step1;

public abstract class Robot {

	private String name;

	public Robot() {
	}

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void attack();

	public abstract void move();

}
