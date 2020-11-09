package state_pattern.step3;

public interface State {

	public void on_button_pushed(Light light);

	public void off_button_pushed(Light light);

}
