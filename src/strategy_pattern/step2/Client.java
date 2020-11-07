package strategy_pattern.step2;

public class Client {

	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atmo");

		taekwonV.setMovingStrategy(new FlyingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());

		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());

		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println();

		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}

}
