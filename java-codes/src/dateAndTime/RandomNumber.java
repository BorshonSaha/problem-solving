package dateAndTime;

import java.util.Random;

public class RandomNumber {
    static void main() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // 0 to 9
        System.out.println(randomNumber);
    }
}
