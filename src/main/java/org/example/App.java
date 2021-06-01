package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int firstNumber, secondNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        firstNumber = input.nextInt();
        System.out.print("What is the second number? ");
        secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum + "\n" +
                firstNumber + " - " + secondNumber + " = " + difference + "\n" +
                firstNumber + " * " + secondNumber + " = " + product + "\n" +
                firstNumber + " / " + secondNumber + " = " + quotient + "\n" );

    }
}
