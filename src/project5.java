public class project5 {
    public static void main(String[] args) {

        //)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.

        int [][]  arr={{ 4,5,6,7,8,9,10 },
                       {30,52,72,30,60},
                       {54,77,32,44,22,21,66,90}};

               int sumEven=0;
               int sumOdd=0;
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j]%2==0){
                    sumEven=sumEven+arr[i][j];
                }else{
                    sumOdd=sumOdd+ arr[i][j];
                }

            }

        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}








