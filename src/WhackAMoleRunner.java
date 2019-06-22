import java.util.Random;

public class WhackAMoleRunner {
public static void main(String[] args) {
	WhackAMole mole= new WhackAMole();
	mole.Gui();
mole.drawButtons(new Random().nextInt(20));
mole.actionPerformed(null);
}
}
