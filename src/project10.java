public class project10 {
    public static void main(String[] args) {
      //Write a java program to find the second largest number in the array?

         int arr[][]={{ 10,434,87,34,23,8,90,8},{3,30,600,6,4,7, 76,17} };
         int max=arr[0][0];
         int max1=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]> max){
                    max1 = max;
                    max=arr[i][j];
                }
            }
        }

        System.out.println(max);


    }
}
