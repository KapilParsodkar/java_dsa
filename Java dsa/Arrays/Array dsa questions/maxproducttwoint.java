import java.util.Arrays;

public class maxproducttwoint {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50};
        System.out.println(Arrays.toString(maxProduct(a)));
    }

    public static int[] maxProduct(int[] intArray) {
       int mp=Integer.MIN_VALUE;
       String pairs="";
       int [] mpa=new int[2];
       for(int i=0;i<intArray.length;i++){
        for(int j=0;j<intArray.length;j++){
            if(intArray[i]!=intArray[j]&&intArray[i]*intArray[j]>mp){
                mp=intArray[i]*intArray[j];
                pairs=Integer.toString(intArray[i])+","+
                Integer.toString(intArray[j]);
           
            }
        }
       }
            System.out.println(pairs);
       for(int i=0;i<intArray.length;i++){
        for(int j=1;j<intArray.length;j++){
            if(intArray[i]*intArray[j]==mp){
                mpa[0]=intArray[i];
                mpa[1]=intArray[j];
            }
        }
       }
       return mpa;
    }
}
