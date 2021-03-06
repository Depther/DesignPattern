package state_pattern.step3;

public class Light {

	private State state;

	public Light() {
		state = new OFF();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void on_button_pushed() {
		state.on_button_pushed(this);
	}

	public void off_button_pushed() {
		state.on_button_pushed(this);
	}

}
