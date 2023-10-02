public class orderedandunorderedprint {
    public static void main(String[] args) {
        int a[]={1,3,4,5};
        int b[]={2,6,7,8};
        ordered(a);
        unordered(a);
        unorderedpairs(a, b);
    }
    public static void ordered(int []a){
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.println( a[i]+" "+a[j]);
            }
        }
    }

        public static void unordered(int []a){
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                System.out.println( a[i]+" "+a[j]);
            }
        }
    }

        public static void unorderedpairs(int []a ,int[] b){
        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i]<b[i])
                System.out.println( a[i]+" "+b[j]);
            }
        }
    }

}
