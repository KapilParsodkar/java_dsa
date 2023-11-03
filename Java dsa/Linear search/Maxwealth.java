public class Maxwealth {
    public static void main(String[] args) {
        int [][] a={{1,5},{7,3},{3,5}};
        System.out.println(wealth(a));
    }
    public static int wealth(int [][] a){
       int ans=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++){
        int sum=0;
        for(int j=0;j<a[i].length;j++){
            sum+=a[i][j];
        }
        if(sum>ans){
            ans=sum;
        }
       }
       return ans;


    }
}
