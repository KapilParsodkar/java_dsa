// Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number

public class missingnumber {
    static int findMissingNumberInArray(int[] arr) {
            
           int n=arr.length+1;
           //beacuse n should be the highest value in array
           //and we can do this beacuse array is sorted and 
           //and has no duplicates
            int formula_sum=(n*(n+1))/2;
            int sum_of_first_natural_num=0;
            for(int a:arr){
                sum_of_first_natural_num+=a;
            }
            int missing=formula_sum-sum_of_first_natural_num;
            return missing;

      }
      public static void main(String[] args) {
        int[] myArray={1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray));
      }
}
