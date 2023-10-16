package homework_week6;
/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme_1 {
    //instance variable
    int a = 10;
    int b = 20;
    // instance method
    public void add(){
        System.out.println(a);
        System.out.println(b);
    }
    //main method and called instance method to main method
    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        obj.add();
        obj.add();
    }
}
