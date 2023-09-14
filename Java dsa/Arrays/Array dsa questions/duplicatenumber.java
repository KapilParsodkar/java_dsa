
// Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

import java.util.Arrays;

public class duplicatenumber {
             
    public static void main(String[] args) {
        int[] a={1,2,2,3,6,6,7,2,4,5,5};
        System.out.println(Arrays.toString(removeDuplicates(a)));
    }

    
    public static int[] removeDuplicates(int[] arr) {
        int n=arr.length;
        int [] uniqueelements=new int [n];
        int index=0;
        for(int i=0;i<n;i++){
            boolean duplicate=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(duplicate==false){
                uniqueelements[index]=arr[i];
                index++;
            }
   
        }
        return Arrays.copyOf(uniqueelements, index);
   
      }
}


// It takes an input integer array as a parameter, named array.
// It calculates the length of the input array and stores it in the variable n.
// It initializes a new integer array called uniqueArray with the same length as the input array array. This new array will store the unique elements.
// It initializes an integer variable index to keep track of the current position in the uniqueArray where unique elements will be stored.
// Now, the code enters a nested loop to check for duplicates:

// The outer loop (with variable i) iterates through each element of the input array from the beginning to the end.

// Inside the outer loop, a boolean variable isDuplicate is initialized to false. This variable is used to track whether the current element at index i is a duplicate.

// The inner loop (with variable j) starts from the next element (i.e., i + 1) and goes to the end of the input array.

// In the inner loop, it checks if the element at array[i] is equal to any element at later indices (i.e., array[j]). If a duplicate is found, it sets isDuplicate to true and breaks out of the inner loop.

// After the inner loop, it checks the value of isDuplicate. If it's still false, it means that the element at index i is unique, so it assigns that element to the uniqueArray at the current index position and increments index by 1.

// This process continues until all elements in the input array have been checked for duplicates.

// Finally:

// It returns the uniqueArray with the duplicates removed. However, since the uniqueArray may be larger than the actual number of unique elements due to its initial size being equal to the input array size, it uses Arrays.copyOf to create a new array that is just the right size to hold the unique elements. It copies the contents of uniqueArray into the new array up to the index position, effectively trimming any unused space in the array.
// In the end, this method returns an array containing only the unique elements from the input array while preserving their original order.