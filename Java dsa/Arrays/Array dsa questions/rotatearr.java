import java.util.Arrays;

public class rotatearr {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        int [] nums2={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(ra(nums,k)));
       ra1(nums2,k);
    }
    //short method

    public static void ra1(int[]nums2,int k){
        int n=nums2.length;
        int a=k%n;
        reverse(nums2,0,n-1);
        reverse(nums2,0,a-1);
        reverse(nums2,a,n-1);

        System.out.println(Arrays.toString(nums2));




    }
     public static void reverse(int[] nums,int start,int end){
        int l=start;
        int r=end;
        while (l<r){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
            r--;

        }
    }

    //long method
    public static int[] ra(int[] nums,int k){
        k=k%nums.length;

        int l=0;
        int r=nums.length-1;
        while (l<r){
            int temp=nums[r];
             nums[r]=nums[l];
             nums[l]=temp;
             l++;
             r--;

        }

        l=0;
        r=k-1;
        while(l<r){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
            r--;
        }

        l=k;
        r=nums.length-1;
        while(l<r){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
            r--;
        }
      return nums;

    }
}
