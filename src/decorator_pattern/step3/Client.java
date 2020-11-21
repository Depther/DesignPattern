package decorator_pattern.step3;

public class Client {

	public static void main(String[] args) {
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();
	}

}
