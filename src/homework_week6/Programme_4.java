package homework_week6;

/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_4 {
    int a = 10;//instance variable
    int b = 20;//instance variable
    static int c = 30;//static variable
    static int d = 40;//static variable
    //instance method, [called instance and static variables]
    public void reliance() {
        System.out.println(a);//instance variable
        System.out.println(b);//instance variable
        System.out.println(Programme_4.c);//static variable
        System.out.println(Programme_4.d);//static variable
    }
    //static method, [called static and instance variable]
    public static void tata() {
        Programme_4 programme4 = new Programme_4();
        System.out.println(programme4.a);//instance variable
        System.out.println(programme4.b);//instance variable
        System.out.println(c);//Static variable
        System.out.println(d);//static variable
    }
    //main method, [called instance and static method]
    public static void main(String[] args) {
        Programme_4 t = new Programme_4();//object created
        t.reliance();//instance method called
        tata();//static method called
    }
}
