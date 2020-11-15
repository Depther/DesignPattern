package command_pattern.step2;

public class Client {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);

		Button button1 = new Button(lampOnCommand);
		button1.pressed();

		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(alarm);

		Button button2 = new Button(alarmOnCommand);
		button2.pressed();

		button2.setCommand(lampOnCommand);
		button2.pressed();
	}

}
