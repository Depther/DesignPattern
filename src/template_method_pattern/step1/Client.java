package template_method_pattern.step1;

import static apple.laf.JRSUIConstants.Direction;

public class Client {

	public static void main(String[] args) {
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		hyundaiMotor.move(Direction.UP);
	}

}
