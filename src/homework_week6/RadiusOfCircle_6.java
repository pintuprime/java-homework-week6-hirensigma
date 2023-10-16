package homework_week6;
import java.util.Scanner;
/*
 Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
public class RadiusOfCircle_6 {
    //main method, in this used scanner class to find radius of circle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object created
        System.out.println("Enter The Radius Of circle:");
        double r = scanner.nextDouble();
        double area = (22 * r * r) / 7;
        System.out.println("Area Of Circle Is : " + area);
        scanner.close();//scanner close
    }
}
