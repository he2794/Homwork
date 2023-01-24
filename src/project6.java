public class project6 {
    public static void main(String[] args) {

       // Write a program to swap 2 numbers without a temporary variable?

     int number1=20;
     int number2=10;
        System.out.println("value of num1 is "+number1);
        System.out.println("value of num2 is "+number2);

        number1 = number1+number2;
        number2 =  number1-number2;
        number1 = number1 - number2;

        System.out.println("value of num1 is "+number1);
        System.out.println("value of num2 is "+number2);



    }
}
