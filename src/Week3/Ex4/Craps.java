package Week3.Ex4;

import java.security.SecureRandom;

public class Craps {
    //Create RNG
    public static final SecureRandom randomNumber = new SecureRandom();
    //final = cannot be manipulated (almost similar to constant)
    //static = want it to be class-wide and usable in all functions

    //Create enum for Game States
    private enum Status {
      WIN, LOSE, CONTINUE
    };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int BOX_CARS = 12;
    
    public static void main(String[] args) {

    }
}
