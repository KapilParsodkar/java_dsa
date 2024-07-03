public class findmaxconsone {
    public static void main(String[] args) {
        int [] arr={1,0,0,1,1,1,0,0,1};
        System.out.println(fmcs(arr));
    }

    public static int fmcs(int [] arr){

        int count=0;
        int ans=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count=0;
            }
            else {
                count++;
            }
            if(count>ans){
                ans=count;
            }

        }
        return ans;
    }
}
