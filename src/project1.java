import java.util.Arrays;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {

     //Using Scanner create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.


      Scanner scaner=new Scanner(System.in);
      int [] values=new int[5];

      int sum=0;
        for (int i = 0; i < values.length; i++) {
            System.out.println(" Please Enter the "+i+"int values of the array");
            values[i]=scaner.nextInt();

            sum+=values[i];

        }
        System.out.println(Arrays.toString(values));
        System.out.println("the sum of the values if : "+ sum);
    }}


