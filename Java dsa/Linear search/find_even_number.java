// in an array we are finding out how many even digits are their as 12 and 13 are evan digits as 1 and 2 is 2 so evan num 13 1 and 3 so 2 even digit

public class find_even_number {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(digits(56768));
        System.out.println(findnumber(nums));
    }
    public static int findnumber(int[] nums){
        int count=0;
       for(int num:nums){
        if(even(num)){
            count++;
        }
       }
        return count;
    }

    public static boolean even(int num){
    int numberofdigits=digits(num);
       if(numberofdigits%2==0){
        return true;
       }
       return false;
    }
//count number of digits in number
   public static int digits (int num){
      int count=0;
      while(num>0){
        count ++;
        num=num/10;
      }
      return count;
    }
}
