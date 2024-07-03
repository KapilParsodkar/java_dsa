import java.util.Arrays;

public class prodofarrexceptself {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(pae(arr)));
        System.out.println(Arrays.toString(pae1(arr)));

    }

    //o(n)
    public static int [] pae1(int [] arr){
        int [] left=new int[arr.length];
        int [] right=new int[arr.length];
        int [] output=new int [arr.length];

        left[0]=1;
        right[arr.length-1]=1;

        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            output[i]=left[i]*right[i];
        }
        return output;
    }
//o(n2) n square
    public static int [] pae(int [] arr){
        int [] r=new int[arr.length];
        Arrays.fill(r, 1);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    r[i]*=arr[j];

                }
            }

        }
        return r;
    }
}
