public class minimumnumber {
    public static void main(String[] args) {
         int []a={18,12,-7,3,14,28};
         System.out.println(minimum(a));
    }


    public static int minimum(int [] a){
        int m =Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(m>a[i]){
                m=a[i];
            }
        }
        return m;
    } 
}
