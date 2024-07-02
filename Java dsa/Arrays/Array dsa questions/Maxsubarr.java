class Maxsubarr {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(msa(arr));

    }
    public static int msa(int[] arr){
        int maxnum=arr[0];
        int current=arr[0];
        for(int i=0;i< arr.length;i++) {
            current = Math.max(arr[i],current+arr[i]);
            if (current > maxnum) {
                maxnum = current;
            }
        }
        return maxnum;
    }
}