public class isUnique {

    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        System.out.println(isUnique(a));
    }

    public static boolean isUnique(int[] intArray) {
        boolean uni=true;
          for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
           if(intArray[i]==intArray[j]){
                uni=false;
           }
            }
          }
          return uni;
    }
}
