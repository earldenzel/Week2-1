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
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            //win cases
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WIN;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOSE;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint){
                gameStatus = Status.WIN;
            }
            else if (sumOfDice == SEVEN){
                gameStatus = Status.LOSE;
            }
        }

        if (gameStatus == Status.WIN){
            System.out.println("WIN!");
        }else{
            System.out.println("LOSE...");
        }

    }

    public static int rollDice(){
        //roll die
        int die1 = randomNumber.nextInt(6) + 1;
        int die2 = randomNumber.nextInt(6) + 1;
        int sum = die1 + die2;

        //display roll and sum to user;
        System.out.printf("Player has rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
