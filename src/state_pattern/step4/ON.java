package state_pattern.step4;

public class ON implements State {

	private static ON ON = new ON();

	private ON() {
	}

	public static ON getInstance() {
		return ON;
	}

	public void on_button_pushed(Light light) {
		System.out.println("반응 없음");
	}

	public void off_button_pushed(Light light) {
		System.out.println("Light Off");
		light.setState(OFF.getInstance());
	}

}
