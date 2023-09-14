public class duplicateso1 {
    public static void main(String[] args) {
        int [] num={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(num));
    }

    public static int removeDuplicates(int[] nums) {
            if(nums.length==0){
                return 0;
            }
            int a=0;
            for(int i=1;i<nums.length;i++){
                if(nums[a]!=nums[i]){
                    a++;
                    nums[a]=nums[i];
                }
            }
            return a+1;
    }
}


// This problem is as straight-forward as its description is 😃. We will be given a sorted array containing duplicates, and we need to keep only single instance of each element. Also, we need to update the array in-place which means we have to do all the manipulations in the same array without using any data structure.