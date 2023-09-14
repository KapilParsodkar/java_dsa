//Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

// myArray = [1, 2, 3, 4]
// middle(myArray)  # [2,3]

import java.util.Arrays;

public class Middlefunction {


    public static int[] middle(int[] array) {
        if(array.length<=2){
            return new int [0];
        }
        
        int [] a=new int [array.length-2];
        
     
        for(int i=1;i<array.length-1;i++){
            a[i-1]=array[i];
        }
        return a;
   }
      
   public static void main(String[] args) {
     int [] myArray = {1, 2, 3, 4,7,8,9,6,4,6,7,9};
 
     System.out.println(Arrays.toString(middle(myArray)));
   }
   
}
