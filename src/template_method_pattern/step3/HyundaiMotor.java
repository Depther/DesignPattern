package template_method_pattern.step3;

import static apple.laf.JRSUIConstants.Direction;

enum MotorStatus { MOVING, STOPPED }

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {

	}

}
