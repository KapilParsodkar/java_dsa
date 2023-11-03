import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int [][] arr={{23,4,1},{18,12,3,9},{78,99,34,56},{18,12}};
        int target=34;
        System.out.println(Arrays.toString(search(arr, target)));

    }

    public static int[] search(int [][]arr, int target){
        int [] a=new int[2];
           for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if( arr[i][j]==target){
                      a[0]=i;
                      a[1]=j;
                }
            }
           }
           return a;
    }
}
