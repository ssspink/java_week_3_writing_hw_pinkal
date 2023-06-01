package java_week3_writing_hw_pinkal;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */



public class Programme_16_FindPositiveNegative
{

    public static void main(String[] args) {


    //scanner  declaration for reading input from console
    Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int number =scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //closing scanner object
        scanner.close();

    }
    // Finding the number is positive Negative or Zero

    public static void findNumberIsPositiveNegativeOrZero(int number)
    {
        if (number > 0){
            System.out.println(number +  " is a POSITIVE number");
        }else if (number < 0){
            System.out.println(number +  " is a NEGATIVE number");
        }else {
            System.out.println("number + is ZERO");
        }
    }

}
