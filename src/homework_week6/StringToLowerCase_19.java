package homework_week6;
import java.util.Scanner;
// Write a Java program to convert a given string into lowercase
public class StringToLowerCase_19 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.print("Input a String: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        scanner.close();//scanner close
    }
}
