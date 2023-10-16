package homework_week6;
import java.util.Scanner;
//Write a program to calculate the area of a triangle
public class TriangleCalculate_8 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Enter the width of the Triangle:");
        double b = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double h = scanner.nextDouble();
        //formula to calculate area = (width*height)/2
        double area = (b * h) / 2;
        System.out.println("Area Of Triangle Is : " + area);
        scanner.close();//scanner close
    }
}
