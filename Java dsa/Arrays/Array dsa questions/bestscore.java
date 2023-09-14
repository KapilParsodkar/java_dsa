
// Given an array, write a function to get first, second best scores from the array and return it in new array.

import java.util.Arrays;

public class bestscore {
    public static int[] findTopTwoScores(int[] array){
             int firstbiggest= Integer.MIN_VALUE;
            int secondbiggest=Integer.MIN_VALUE;
            for(int i=0;i<array.length;i++){
              if(array[i]>firstbiggest){
                secondbiggest=firstbiggest;
                firstbiggest=array[i];
              }else if(array[i]>secondbiggest && array[i]<firstbiggest){
                secondbiggest=array[i];
              }
            }
            return new int [] {firstbiggest,secondbiggest};
      }

      public static void main(String[] args) {
        int [] myArray = {84,85,86,88,87,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
      }
}
