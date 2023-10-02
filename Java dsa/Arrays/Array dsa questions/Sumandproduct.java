public class Sumandproduct{
    public static void main(String[] args) {
        int [] a={1,3,4,5};
        sp(a);
    }

    public static void sp(int [] a ){
        int sums=0;
        int products=1;

        for(int i=0;i<a.length;i++){
            sums+=a[i];
            products*=a[i];
        }
        System.out.println("sum is "+sums+" and product is "+products);
    }
}