package homework_week6;
import java.util.Scanner;
/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */
public class AddTwoBinaryNum_16 {
    //main method
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Input First Binary Number: ");
        binary1 = scanner.nextLong();
        System.out.println("Input Second Binary Number: ");
        binary2 = scanner.nextLong();
        //while loop used
        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        //if loop used
        if (remainder != 0) {//if loop used
            sum[i++] = remainder;
        }
        --i;
        System.out.println("Sum Of Two Binary Number: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
        scanner.close();//closing scanner
    }
}
