public class project3 {
    public static void main(String[] args) {

    // v3) Create a 2D array of integer values. Print the sum of all numbers.

        int array [][] ={{ 1,2,3,4,5 },
                         {6,7,8,9,10},
        };

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [i].length; j++) {
                sum=sum+array[i][j];
            }
        }
        System.out.println(sum);

    }
}
