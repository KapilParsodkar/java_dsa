public class stocksbuynsell {
    public static void main(String[] args) {
        int [] a={3,1,4,8,7,2,5};
        System.out.println(profit(a));
    }

    public static int profit(int [] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        int max=Integer.MIN_VALUE;
                for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int max_profit=max-min;
        return max_profit;
    }
}
//antime buy and sell