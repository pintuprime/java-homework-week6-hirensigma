package homework_week6;
import java.util.Scanner;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
 */
public class RemainderOfTwoNumber_18 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.print("Input First Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input Second Number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1 % num2));
        scanner.close();//scanner close
    }
}
