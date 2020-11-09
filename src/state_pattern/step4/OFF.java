package state_pattern.step4;

public class OFF implements State {

	private static OFF OFF = new OFF();

	private OFF() {
	}

	public static OFF getInstance() {
		return OFF;
	}

	public void on_button_pushed(Light light) {
		System.out.println("Light On");
		light.setState(ON.getInstance());
	}

	public void off_button_pushed(Light light) {
		System.out.println("반응 없음");
	}

}
