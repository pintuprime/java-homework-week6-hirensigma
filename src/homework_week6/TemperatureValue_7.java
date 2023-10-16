package homework_week6;
import java.util.Scanner;
/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class TemperatureValue_7 {
    //main method
    public static void main(String[] args) {
        double a, c;
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Enter Fahrenhelt Temperature");
        a = scanner.nextDouble();
        System.out.println("Celsisus Temperature Is = " + celsius(a));
        scanner.close();//scanner close
    }
    static double celsius(double f)
    {
        return (f - 32) * 5 / 9;
    }
}
