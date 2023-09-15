public class Permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
    System.out.println(permutation(array1,array2));
    }
    public static boolean permutation(int[] array1, int[] array2){
       int sum1=0;
       int sum2=0;
       int mul1=1;
       int mul2=1;

       for(int i:array1){
         sum1+=i;
       }
       System.out.println(sum1);
          for(int i=0;i<array2.length;i++){
         sum2+=array2[i];
       }

          for(int i=0;i<array1.length;i++){
         mul1*=array1[i];
       
       }
         System.out.println(mul1);

              for(int i=0;i<array2.length;i++){
         mul2*=array2[i];
         
       }
     System.out.println(mul2);
       if(sum1==sum2&&mul1==mul2){
        return true;
       }else{
        return false;
       }
    }
}
