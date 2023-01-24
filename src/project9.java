public class project9 {
    public static void main(String[] args) {

        //)Maximum and minimum number in the array?
         
        int arr[] = { 3000, 11, 445,
                1, 330, 6000 };

        int numberSize= 6;
        int[] number = new int[0];
        int minimum=number[0];
        int maximum=number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] >maximum) {
                maximum=number[i];

            } else if (number[i] < minimum) {
                minimum=number[i];
            }
        }
        System.out.println("The maximum number is "+ maximum);
        System.out.println("The minimum number is "+ minimum);
    }


}

