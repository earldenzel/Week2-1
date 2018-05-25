package Week3.Ex1;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 floating point values separated by spaces:");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("The maximum is: " + result);
    }

    //Finds the maximum value in 3 double values
    public static double maximum(double x, double y, double z){
        return Math.max(x, Math.max(y,z));
        /*
        double maximumVal = x;
        if (y>maximumVal){
            maximumVal = y;
        }
        if (z>maximumVal){
            maximumVal = z;
        }
        return maximumVal;
        */
    }
}
