package homework_week6;
/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme_3 {
    int a = 10;//instance  variable
    static int b = 20;// static variable
    //instance method
    public void xyz() {
        System.out.println(a);
        System.out.println(b);
    }
    //static method
    public static void call() {
        Programme_3 t = new Programme_3();//object created
        System.out.println(t.a);
        System.out.println(b);
    }
    //main method, [in main method called both method ie instance and static]
    public static void main(String[] args) {
        Programme_3 obj = new Programme_3();
        obj.xyz();//instance method called
        call();//static method call
    }
}
