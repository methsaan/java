import java.util.Random;

public class Dice {
	public int sides;
	public int value;
	public Random rand;
	public Dice(int sides) {
		this.sides = sides + 1;
		this.rand = new Random();
	}
	public void roll() {
		this.value = this.rand.nextInt(this.sides);
	}
}
