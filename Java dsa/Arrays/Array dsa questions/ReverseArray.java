import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        reverse(a);
    }

    public static void reverse(int [] a){
        for(int i=0;i<a.length/2;i++){
            int other=a.length-i-1;
            int temp=a[i];
            a[i]=a[other];
            a[other]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
