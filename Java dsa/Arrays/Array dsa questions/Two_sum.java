import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
         int a[]={2,7,11,15};
         int b=9;
         System.out.println(Arrays.toString(twoSum(a,b)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] numbers=new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                     numbers[0]=i;
                     numbers[1]=j;
                }
            }
        }
        return numbers;
    }
}




