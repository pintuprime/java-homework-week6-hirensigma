package homework_week6;
import java.util.Scanner;
/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
public class Calculator_5 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object created
        System.out.println("Hello ! Please Input First Number And Enter: ");
        int a = scanner.nextInt();
        System.out.println("Now Enter Second Number And Enter: ");
        int b = scanner.nextInt();
        addition(a, b);//static method called
        subtraction(a, b);//static method called
        Calculator_5 obj = new Calculator_5();//object creat
        obj.division(a, b);//instance method called
        obj.multiplication(a, b);//instance method called
        scanner.close();//scanner close
    }
    //static method
    public static void addition(int a, int b) {
        int add = a + b;
        System.out.println("Addition Of Two Number Is: " + add);
    }
    //static methos
    public static void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction Of Two Number Is: " + sub);
    }
    //instance method
    public void division(int a, int b) {
        int div = a / b;
        System.out.println("Division Of Two Number Is: " + div);
    }
    //instance method
    public void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication Of Two Number Is: " + mul);
    }
}

