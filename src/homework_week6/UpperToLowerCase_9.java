package homework_week6;
import java.util.Scanner;
//Write a program to convert the upper case to lower case.
public class UpperToLowerCase_9 {
    //main method
    public static void main(String[] args) {
        char ch, ch2;
        System.out.println("Enter Any Character");
        Scanner scanner = new Scanner(System.in);//scanner object
        ch = scanner.next().charAt(0);
        //if else loop use
        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lowercase  " + ch2);
        } else {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase  " + ch2);
            scanner.close();//scanner close
        }

    }
}
