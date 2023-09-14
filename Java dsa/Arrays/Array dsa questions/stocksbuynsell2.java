public class stocksbuynsell2 {
    public static void main(String[] args) {
        int [] a={7, 1, 5, 3, 6, 4};
        System.out.println(profit(a));
    }

    public static int profit(int [] a){
        int min=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }else if(a[i]-min>max_profit){
                max_profit=a[i]-min;
            }
        }
        return max_profit;
    }
}
//first buy then sell