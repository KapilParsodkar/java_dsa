public class maxsubproduct {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        System.out.println(msps(arr));
    }

    public static int msps(int [] arr){
        int max=arr[0];
        int min=arr[0];
        int result=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=0){
                max=Math.max(arr[i],max*arr[i]);
                min=Math.min(arr[i],min*arr[i]);

            }
            else {
                int temp=max;
                max=Math.max(arr[i],min*arr[i]);
                min=Math.min(arr[i],temp*arr[i]);
            }
            result=Math.max(result,max);
        }
        return result;
    }
}
