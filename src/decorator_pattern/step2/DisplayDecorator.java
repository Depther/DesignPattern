package decorator_pattern.step2;

public abstract class DisplayDecorator extends Display {

	private Display decorateDisplay;

	public DisplayDecorator(Display decorateDisplay) {
		this.decorateDisplay = decorateDisplay;
	}

	public void draw() {
		decorateDisplay.draw();
	}

}
