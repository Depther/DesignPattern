package template_method_pattern.step2;

import static apple.laf.JRSUIConstants.Direction;

enum MotorStatus { MOVING, STOPPED }

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door) {
		super(door);
	}

	private void moveHyundaiMotor(Direction direction) {
		//
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING) return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED) door.close();

		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}

}
