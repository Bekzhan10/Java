package HW_11;

import java.util.Locale;
import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("Enter a number: ");
            scan.useLocale(Locale.US);
            double number = scan.nextDouble();
            System.out.println("Square root of " + number + " is " + Math.sqrt(number));
        }
        catch (Exception e ){
            System.out.println("Enter a valid number.");
        }
        divide(25,0);
        sumOfLexeme("12 10 22");
    }

    public static void divide(int x, int y){
        try {
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero ");
        }
        finally {
            System.out.println("Everything is done");
        }
    }
    public static void sumOfLexeme(String lexeme){
        try {
            int sum = 0;
            for (String num : lexeme.split(" ")){
                int a = Integer.parseInt(num);
                sum += a;
            }
            System.out.println("Sum of integers in lexeme is " + sum);
        }
        catch (Exception e){
            System.out.println("Please enter correctly");
        }
    }
}