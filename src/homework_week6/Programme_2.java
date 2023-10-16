package homework_week6;
/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme_2 {
    //Static variables
    static int a = 10;
    static int b = 20;
    //Static method, called static variable in static method and print
    public static void call() {
        System.out.println(a);
        System.out.println(b);
    }
    //Main method [In main method static method called]
    public static void main(String[] args)
    {
        call();//static method called
    }
}
