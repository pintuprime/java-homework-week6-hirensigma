package homework_week6;
// Write a Java program to convert a decimal number to binary number.
public class DecimalToBinary_17 {
    //static method
    public static void toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        //while loop used
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        //for lop used
        for(int i = index-1;i >=0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }
     //main method
    public static void main(String[] args) {
        System.out.println("Decimal os 5 is: ");
        toBinary(5);
    }
}


