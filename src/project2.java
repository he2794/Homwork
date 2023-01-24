import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {

        //2)Using Scanner create an array of countries. When an array is created, retrieve all values
        // from it and while retrieving those values print capital for each country. (use 2 different loops).



            String[] countries = new String[3];
            String[] capitals = new String[3];

            Scanner scanner = new Scanner(System.in);

            for(int start = 0 ; start < 3 ; start ++ ) {
                System.out.println("Enter Country ");
                countries[start] = scanner.next();
                System.out.println("Enter Country Capital");
                capitals[start] = scanner.next();
            }


            for (int index = 0; index < countries.length ; index ++ ) {
                System.out.println("Country is " + countries[index]);
                System.out.println("Capital is " + capitals[index]);
            }
        }




    }

