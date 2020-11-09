package state_pattern.step3;

public class ON implements State {

	public void on_button_pushed(Light light) {
		System.out.println("반응 없음");
	}

	public void off_button_pushed(Light light) {
		System.out.println("Light Off");
		light.setState(new OFF());
	}

}
