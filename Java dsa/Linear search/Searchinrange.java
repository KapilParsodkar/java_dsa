public class Searchinrange{
    public static void main(String[] args) {
         int [] a={1,2,3,4,5,6,7,8};
         int target=5;
         int start=2;
         int end=6;
         System.out.println(range(a, target, start, end));
    }

    public static int range( int[] array,int target,int start,int end){
        for(int i=start;i<end;i++){
           if(array[i]==target){
            return i;
           }
        }
        return -1;
    }
}