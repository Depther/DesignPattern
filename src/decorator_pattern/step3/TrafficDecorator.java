package decorator_pattern.step3;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw();
		drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("교통량 표시");
	}

}
