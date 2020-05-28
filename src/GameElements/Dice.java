package GameElements;

import java.util.Random;
public class Dice {
    public int rollDice() {
        Random random = new Random();
        int number = random.nextInt(6);
        return number +1;
    }
}
