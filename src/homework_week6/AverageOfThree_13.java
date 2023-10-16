package homework_week6;
import java.util.Scanner;
/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class AverageOfThree_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Input First Number: ");
        double x = scanner.nextDouble();
        System.out.println("Input Second Number: ");
        double y = scanner.nextDouble();
        System.out.println("Input Third Number: ");
        double z = scanner.nextDouble();
        System.out.println("The Average Value is " + average(x, y, z) + "/n");
        scanner.close();//scanner close
    }
    //static method
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;

    }
}
