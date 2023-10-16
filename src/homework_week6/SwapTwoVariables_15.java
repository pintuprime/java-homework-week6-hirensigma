package homework_week6;
//. Write a Java program to swap two variables.
public class SwapTwoVariables_15 {
    //main method
    public static void main(String[] args) {
        int a = 5;//instance variable
        int b = 10;//instance variable
        System.out.println("Before Swapping, a = " + a + " and b =" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping, a = " + a + " and b = " + b);
    }
}
